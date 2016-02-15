/*This code scans the entityfact.csv file, 
* finds each value separated by commas, 
* and prints them out individually when the user hits the enter key. 
*
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class csvReader {

    public static void main(String[] args) throws FileNotFoundException {
        //scans through the file, separating values with the delimiter ","
        Scanner scanner = new Scanner(new File("/Users/wshuhda/Desktop/entityfacts.csv"));
        Scanner input = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        //prints out following values on new lines after user hits enter
        while(scanner.hasNextLine()){
            System.out.println(scanner.next());
            System.out.println("Please hit enter to get next value");
            String inputStr = input.nextLine();
        }
        //closes scanner
        scanner.close();
    }

}