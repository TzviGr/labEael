import java.util.Scanner;

public class MainClock {

    public static void main(String[] args) {
        Clock clock=new Clock();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Time");
        int[] putFirstTime={scanner.nextInt(), scanner.nextInt()};
        System.out.println("Enter second Time");
        int[] putSecondTime={scanner.nextInt(), scanner.nextInt()};
        if (putFirstTime[0]>putSecondTime[0]||putFirstTime[0]==putSecondTime[0]&&putFirstTime[1]>putSecondTime[1]){
            System.out.println("the second will land earlier "+putFirstTime[0]+":"+putFirstTime[1]);
        }
        else if (putFirstTime[0]<putSecondTime[0]||putFirstTime[0]==putSecondTime[0]&&putFirstTime[1]<putSecondTime[1]){
            System.out.println("the first will land earlier "+putFirstTime[0]+":"+putFirstTime[1]);
        }
    }

}
