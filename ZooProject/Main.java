package ZooProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        int continueloop = 1;
        int continueinnerloop;
        int menuchoice;
        do {
            switch (animalchoicemenu(keyword)) {
                case 1:
                    Tiger tiger = new Tiger();
                    tiger.setNameOfAnimal("Tiger");
                    do {
                        menuchoice = animaldetailmanipulationmenu(keyword, tiger);
                        switch (menuchoice) {
                            case 1:
                                System.out.println("Enter number of stripes,speed.");
                                tiger.setProperties(keyword.nextInt(), keyword.nextInt(), keyword.nextInt());

                                break;
                            case 2:
                                tiger.displayProperties();
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;

                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal? (1=y /2=n)");
                        continueinnerloop = keyword.nextInt();
                    } while (continueinnerloop == 1);

                    break;
                case 2:
                    Dolphin dolphin = new Dolphin();
                    dolphin.setNameOfAnimal("Dolphine");
                    do {
                        menuchoice = animaldetailmanipulationmenu(keyword, dolphin);
                        switch (menuchoice) {
                            case 1:
                                System.out.println("Enter color and swimming speed :");
                                keyword.nextLine();
                                String color = keyword.nextLine();
                                int swimspeed = keyword.nextInt();
                                dolphin.setProperties(color, swimspeed);

                                break;
                            case 2:
                                dolphin.displayProperties();
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not Supported");

                        }
                        System.out.println("continue with animal? (1=y / 2=n):");
                        continueinnerloop = keyword.nextInt();

                    } while (continueinnerloop == 1);
                    break;
                case 3:
                    Penguin penguin = new Penguin();
                    penguin.setNameOfAnimal("Penguin");
                    do {
                        menuchoice = animaldetailmanipulationmenu(keyword, penguin);
                        switch (menuchoice) {
                            case 1:
                                String feather = keyword.nextLine();
                                int walk = keyword.nextInt();
                                int swim = keyword.nextInt();
                                penguin.setProperties(feather, walk, swim);

                                break;
                            case 2:
                                penguin.displayProperties();
                                break;
                            case 3:
                                penguin.walking();
                                penguin.swimming();
                                break;
                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;

                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("continue with animal?(1 = y / 2 = n):");
                        continueinnerloop = keyword.nextInt();

                    } while (continueinnerloop == 1);
                    break;
                default:
                    System.out.println("sorry no such animal available.");

            }
            System.out.println("continue main zoo menu?(1 = y / 2 = n):");
            continueloop = keyword.nextInt();

        } while (continueloop == 1);

    }

    private static int animalchoicemenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal: ");
        return keyboard.nextInt();
    }

    private static int animaldetailmanipulationmenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.print("Enter choice (1-4): ");
        return keyboard.nextInt();
    }
}
