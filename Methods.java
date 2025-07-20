public class Methods {
    static String[] ingredentens;
    static boolean sandwichready;

    public static void nogreet() {
        ingredentens = new String[4];
        ingredentens[0] = "bread";
        ingredentens[1] = "chicken sclice";
        ingredentens[2] = "cheese slices";
        ingredentens[3] = "lettuce";
        System.out.println("all the ingredents are arranged.");

    }

    public static void greet() {
        if (ingredentens.length == 4) {
            if (ingredentens[0].equals("bread") &&
                    ingredentens[1].equals("chicken sclice") &&
                    ingredentens[2].equals("cheese slices") &&
                    ingredentens[3].equals("lettuce")) {
                System.out.println("Assemble the sandwich...");
                sandwichready = true;
            } else {
                System.out.println("it's take some time , please wait");
            }
        }
    }

    public static void main(String[] args) {
        nogreet();

        greet();
    }
}
