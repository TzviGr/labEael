import java.util.Scanner;

public class exercrise5 {
    public static void main(String[] agrs) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Dollar-Shekel exchange rate: " );
            double number1 = scanner.nextDouble();
            System.out.println("Enter how much Dollar you want: ");
            int number2 = scanner.nextInt();
            double sum=number1*number2;
            System.out.println("The equivalent amount in Shekels is:" + sum);
    }
    }