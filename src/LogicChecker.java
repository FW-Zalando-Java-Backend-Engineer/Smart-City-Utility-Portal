public class LogicChecker {

    public static String classifyUsage(int units,  boolean overBudget ) {
        // TODO: Use nested if-else and logical operators to classify usage
        if (units > 400 && overBudget){
            return "Critical ⚠️";
        }else if (units > 300){
            return "Excessive";
        }else if (units > 200) {
            return "High";
        } else if (units > 100) {
            return "Moderate";
        } else {
            return "Low";
        }


    }

    public static void main(String[] args) {
        System.out.println(classifyUsage(401, true)); // Critical ⚠️
    }
}
