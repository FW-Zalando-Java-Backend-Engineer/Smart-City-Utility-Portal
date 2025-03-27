public class ResidentDashboard {

    public static void showWelcome(String name) {
        // TODO: Print a welcome message
        System.out.println("Welcome back, " + name + "! 💡");
    }

    public static int getDaysSinceLastReading(int lastDay) {
        // TODO: Calculate number of days (Assume current day = 30)
        int currentDay = 30; // Assume day 30 as the current day

        return currentDay - lastDay;
    }
}
