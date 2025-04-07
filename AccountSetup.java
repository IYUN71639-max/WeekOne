// Isaac Yun
// 4/7
// Account Setup
import java.util.*;
public class AccountSetup{
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a username: ");
        String user = input.next();
        
        
        System.out.print("Please enter a password with at least 8 characters: ");
        String password = input.next();
        int passwordLength = password.length();
        while (passwordLength < 8) {
            System.out.print("Password must be greater than 8 characters: ");
            password = input.next();
            passwordLength = password.length();
        }System.out.println();

        String userLowercase = user.toLowerCase();
        String passwordLowercase = password.toLowerCase();
        System.out.println("Your username is "+userLowercase+" and your password is "+passwordLowercase);
    }
}