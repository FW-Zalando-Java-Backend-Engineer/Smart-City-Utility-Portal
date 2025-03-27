public class AdminPanel {

    public static void adminMenu(String role, int action) {
        // TODO: Use switch(role) and nested switch(action)
        switch (role.toLowerCase()){ //role… case insensitive
            case "superadmin":
                switch (action) {
                    case 1:
                        System.out.println("Viewing all users...");
                        break;
                    case 2:
                        System.out.println("Resetting system data...");
                        break;
                    default:
                        System.out.println("Invalid action.");
                }
                break;
            case "moderator":
                if (action == 1) {
                    System.out.println("Viewing all users...");
                }else {
                    System.out.println("Permission denied.");
                }
                break;
            default:
                System.out.println("Access denied. Invalid role.");
        }

    }

    public static void main(String[] args) {
        adminMenu("Superadmin", 1); // Viewing all users...
    }
}
