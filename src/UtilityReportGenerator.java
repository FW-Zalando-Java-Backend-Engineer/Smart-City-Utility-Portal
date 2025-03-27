public class UtilityReportGenerator {

    public static String generateReport(String name, int units, boolean isOverBudget) {
        // TODO: Call BillingCalculator, LogicChecker, and format report string
        double bill = BillingCalculator.calculateBill(units);
        String usage = LogicChecker.classifyUsage(units, isOverBudget);

        return "Report for "+ name +":\n"+
                "- Units: "+ units+" \n"+
                "- Usage: "+ usage+" \n"+
                "- Over Budget: "+ (isOverBudget ? "Yes" : "No") + " \n"+
                "- Total Bill: €"+ bill;
    }

    public static void main(String[] args) {
        String report =  generateReport("Safwan", 350, true);
        System.out.println(report);
    }
}
