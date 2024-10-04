import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double gallons = 0;
        double fuelEfficiency = 0;
        double gallonPrice = 0;
        String trash = "";
        boolean booGallons = false;
        boolean booEfficiency = false;
        boolean booPrice = false;
        double maxDistance = 0;
        double hundredMiles = 0;
        double hundredCost = 0;
        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("Enter the amount of gallons in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                booGallons = true;


            }
        } while (!booGallons);

        do {

            System.out.println("Enter the miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                booEfficiency = true;
            }
        }while (!booEfficiency);

        do {
            System.out.println("Enter the cost per gallon: ");
            if (scanner.hasNextDouble()) {
                gallonPrice = scanner.nextDouble();
                booPrice = true;
                }
        }while (!booPrice);
            {
                hundredMiles = 100 / fuelEfficiency;
                hundredCost = hundredMiles * gallonPrice;
                System.out.println("It will cost you " + hundredCost + " To travel 100 miles");

                maxDistance = fuelEfficiency * gallons;
                System.out.println(" Your car can travel" + maxDistance + " Miles with a full tank of gas");
            }
    }
}

