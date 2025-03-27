public class LoginSystem {

    public static String authenticate(String username, String password) {
        // TODO: Check credentials using if-else or ternary
        // Return: "Login successful" or "Invalid credentials"
        String correctUsername = "Admin";
        String correctPassword = "Qwerty123";
        String feedBack = "Invalid credentials";

     if(username.equals(correctUsername) && password.equals(correctPassword)) {
         feedBack =  "Login successful";
       }
//      else {
//         feedBack =  "Invalid credentials";
//       }
         return feedBack;



        // Best practice
       // return (username.equals(correctUsername) && password.equals(correctPassword) ) ? "Login successful":  "Invalid credentials";
    }

    public static void main(String[] args) {
            String feedback = authenticate("admin", "Qwerty123"); // Invalid credentials
        System.out.println(feedback);
    }
}
