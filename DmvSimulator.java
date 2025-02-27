
import java.util.*;

public class DmvSimulator {
    public static void main(String args[]) {
    
        System.out.println("Welcome to the DMV");

        //create instnace of Random class
        Random randNum = new Random();

        //Generate random int in range 0 to 101
        int userNumber = randNum.nextInt(101);
        System.out.println("You're Number is " + userNumber);


        //call out each number after the userNumber and then loop around until your number is reached
        int currentNumber = userNumber + 1;

        while (true) {
            if (currentNumber > 100 ) {
                currentNumber = 1;
            }

            System.out.println("Current Number: " + currentNumber);

            if (currentNumber == userNumber) {
                System.out.println("Your number has been called " + userNumber);
                break;
            }

            currentNumber++;
        }

        System.out.println("You do not have the required paperwork");
    
    }
}