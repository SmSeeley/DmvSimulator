
import java.util.*;

public class DmvSimulator {
    public static void main(String args[]) {
    
        System.out.println("Welcome to the DMV");

        //create instnace of Random class
        Random randNum = new Random();

        //Generate random int in range 100 to 200
        int userNumber = randNum.nextInt(200 - 100 + 1) + 100;
        System.out.println("You're Number is " + userNumber);


        //call out each number after the userNumber and then loop around until your number is reached
        int currentNumber = 100;

        while (true) {
            if (currentNumber > 200 ) {
                currentNumber = 100;
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