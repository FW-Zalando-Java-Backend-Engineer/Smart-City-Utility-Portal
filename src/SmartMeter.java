public class SmartMeter {

    public static void logUsage(String name, int units) {
        // TODO: Log user name and usage
        System.out.println("User: " + name + ", Usage: " + units + " units");
    }

    public static void logUsage(String name, int day, int units) {
        // TODO: Overloaded version with day
        System.out.println("User: " + name + ", Day: " + day + ", Usage: " + units + " units");
    }
}
