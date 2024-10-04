import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guessedInt = 0;
        String trash;
        boolean done = false;
        boolean valid = false;
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;


        do {
            System.out.println("Pick a number between 1 and 10");
            if(scanner.hasNextInt())
            {
                guessedInt = scanner.nextInt();
                if (guessedInt >= 1 && guessedInt <= 10)
                {
                    if (guessedInt > val)
                    {
                        System.out.println("Your number is too high, the number was " + val);
                    }

                    else if (guessedInt < val)
                    {
                        System.out.println("That number ins too low, the number was " + val);

                    }

                    else{
                        System.out.println("That is the correct number!");
                    }
                    valid = true;
                }
                else{
                    System.out.println("Please enter a number between 1-10");
                }


            }
            else
            {
                trash = scanner.nextLine();
                System.out.println("Please enter a valid number");
            }
           }while(!valid);













    }
}
