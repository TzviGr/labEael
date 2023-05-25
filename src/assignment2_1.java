//hershy grinboim.
import java.util.Scanner;
public class assignment2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = scanner.nextInt();
        double sum = 0;
        sum+=grade;
        int counter = 0;
        int max = 0;
        int min = 100;
        while (grade != -1) {
            if (grade >=0 && grade <= 100) {
                if (max < grade) {
                    max = grade;
                }
                if (min > grade) {
                    min = grade;
                }
                sum += grade;
                counter++;
                System.out.println("Enter a grade");
                grade = scanner.nextInt();
            } else {
                System.out.println("Enter a grade between 0-100");
                grade = scanner.nextInt();
            }
        }
        if (grade == -1) {
            double average = sum / counter;
            System.out.println("you have " + counter + " grades");
            System.out.println(String.format("The average is: %.2f", average));
            System.out.println("The max of grades is: " + max);
            System.out.println("The min of grades is: " + min);

        }
    }
}


