public class BillingCalculator {

    public static double calculateBill(int unitsUsed) {
        // TODO: Use if-else and arithmetic to calculate electricity bill

        double total = 0.0;

        if (unitsUsed <= 100) {
            total = unitsUsed * 1;
        } else if (unitsUsed <= 200) {
            total = (100 * 1) + (unitsUsed - 100) * 2;
        } else {
            total = (100 * 1) + (100 * 2) + (unitsUsed - 200) * 3;
        }

        // Add 5% surcharge if usage > 250
        if(unitsUsed > 250) {
            total += total * 0.5; // total =  total + (total * 0.5);
        }

        return total;
    }

    public static void main(String[] args) {
        double bill = calculateBill(350); // 1125.0
        System.out.println(bill);
    }
}
