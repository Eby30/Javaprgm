//Create a login package
package login;

public class LoginCheck {
    public static void main(String[] args) {
// Hardcoded User Input
        String EnteredUsername = "admin";
        String EnteredPassword = "java123";
//Default Required Input 
        String CorrectUsername = "admin";
        String CorrectPassword = "java123";
// Login Check
        if (EnteredUsername.equals(CorrectUsername)&& EnteredPassword.equals(CorrectPassword))
        {System.out.println("Login Successful");    
// Login is Incorrect
        } else {
        System.out.println("Access Denied");

        }
    }
}
