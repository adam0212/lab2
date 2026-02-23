
import java.util.Scanner;
/** 
* ProChall2 class does the following:
 * 1. gets input for first, middle, and last name of user
 * 2. prints out full name by combining names
 * 3. prints out initials by taking first letter of each name
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.1
 * @since 2/22/2026
 */

public class ProgChall2
{
    public static void main (String[] args) {  
        
        String firstName, middleName, lastName;
        char fIn, mIn, lIn;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        
        System.out.print("Enter your middle name: ");
        middleName = keyboard.nextLine();
        
        System.out.print("Enter your last name: ");
        lastName = keyboard.nextLine();
        
        fIn = firstName.charAt(0);
        mIn = middleName.charAt(0);
        lIn = lastName.charAt(0);
        
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + fIn + mIn + lIn);
        
    }
}