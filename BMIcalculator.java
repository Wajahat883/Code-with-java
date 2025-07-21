public class BMIcalculator {
    public double calculatebmi(double weightinpounds, double hegihtininches) {
        return weightinpounds / (hegihtininches * hegihtininches) * 703;

    }

    public double calculatebmiMetric(double weightinkilos, double heightinmeter) {
        return weightinkilos / (heightinmeter * heightinmeter);
    }
}
