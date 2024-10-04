import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;


        do
        {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your temperature in Celsius ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                done = true;
            } else {
                trash = scanner.next();
                System.out.println("Invalid input. Enter a number.");
                scanner.next();


            }
            fahrenheit = celsius * (1.8) + 32;
            System.out.println("The temperature in Fahrenheit is " + fahrenheit + " Boiling point is 100 degrees celsius,the freezing point is 0 degrees celsius ");
        } while (!done);





    }
}
