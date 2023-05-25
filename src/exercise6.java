import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of seconds: ");
        int seconds = scanner.nextInt();
        int minutes=seconds/60;
        int minutes1=seconds%60;
        if (seconds<300){
            System.out.println("The minutes is : " + minutes+":"+minutes1);
        }
        else {
            System.out.println("not good");
        }
        }
    }

