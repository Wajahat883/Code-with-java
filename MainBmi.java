public class MainBmi {
    public static void main(String[] args) {
        BMIcalculator bmIcalculator = new BMIcalculator();
        double weightinpounds = 154.0;
        double hegihtininches = 70.0;

        double bmiimperal = bmIcalculator.calculatebmi(weightinpounds, hegihtininches);
        double weightinkilos = 70.0;
        double heightinmeter = 1.82;
        double bmimetric = bmIcalculator.calculatebmiMetric(weightinkilos, heightinmeter);
        System.out.println("bmi imperal :" + bmiimperal);
        System.out.println("bmi imperal :" + bmimetric);

    }
}
