import java.util.Scanner;

public class assignment2_2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 4 different digits: ");
        int n=scanner.nextInt();
        for (int number=scanner.nextInt(); number<=n; number++){
            System.out.print(n+" ");
        }
    }
}

