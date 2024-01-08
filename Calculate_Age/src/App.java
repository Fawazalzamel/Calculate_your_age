import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter you birth year ");
        int birthYear = myScanner.nextInt();

        System.out.println("Please enter you birth month ");
        int birthMonth = myScanner.nextInt();

        System.out.println("Please enter you birth day ");
        int birthDay = myScanner.nextInt();


        Calendar today = Calendar.getInstance();

        Calendar dayOfBirth = Calendar.getInstance();

        dayOfBirth.set(birthYear, birthMonth-1, birthDay);
       
        int age= today.get(Calendar.YEAR)-dayOfBirth.get(Calendar.YEAR);
        
        System.out.println("Your age is "+ age );


        
        


    }
}
