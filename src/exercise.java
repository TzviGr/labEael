import java.util.Scanner;

public class exercise {
    public static void main(String[] agre){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        int counter=1;
        while (counter<5){
            if (number%2==0){
                counter++;
            }
            System.out.println("Enter a number");
            number=scanner.nextInt();
        }

    }

}
