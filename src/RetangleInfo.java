import java.util.Scanner;
public class RetangleInfo {

    public static void main(String[] args) {
        double width = 0;
        double length = 0;
        double area = 0;
        double perimeter = 0;
        double diagFirst;
        double diag = 0;

        Scanner scanner = new Scanner(System.in);
        boolean booWidth = false;
        boolean booLength = false;


        do {
            System.out.println("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                booWidth = true;
            }

        } while (!booWidth);

        do {
            System.out.println("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                length = scanner.nextDouble();
                booLength = true;
            }

        } while (!booLength);
        {
            area = width * length;
            System.out.println("The area of the rectangle is " + area);
            diagFirst = Math.pow(width, 2) + Math.pow(length, 2);
            diag = Math.sqrt(diagFirst);
            System.out.println(" The diagonal length is " + diag);

        }

    }
}

