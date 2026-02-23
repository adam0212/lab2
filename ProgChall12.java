
import java.util.Scanner;
/** 
* ProChall12 class does the following:
 * 1. gets input for city name
 * 2. prints out number of characters in name
 * 3. prints out name in uppercase
 * 4. prints out name in lowercase
 * 5. prints out first character of name
 * 
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.1
 * @since 2/22/2026
 */

public class ProgChall12
{
    public static void main (String[] args) {  
        
        String city, cityupper, citylower;
        char first;
        int citychars;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a city: ");
        city = keyboard.nextLine();
        
        citychars = city.length();
        cityupper = city.toUpperCase();
        citylower = city.toLowerCase();
        first = citylower.charAt(0);
        
        System.out.println("The city entered has: " + citychars + " chars");
        System.out.println("In upper case: " + cityupper);
        System.out.println("In lower case: " + citylower);
        System.out.println("First character: " + first);
        
    }
}