import java.util.Scanner;

public class exercrise3 {
    public static float getAverage3Numbers(int number1,int number2,int number3){
        int sum = number1+number2+number3;
        float average=(float) sum/3F;
        return average;
    }
    public static float getAverage4Numbers(int number1,int number2,int number3,int number4) {
        int sum = number1 + number2 + number3 + number4;
        float average = (float) sum / 4F;
        return average;
    }
    public static float getAverage5Numbers(int number1,int number2,int number3,int number4,int number5) {
        int sum = number1 + number2 + number3+number4+number5;
        float average = (float) sum / 5F;
        return average;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter number: ");
        int number2=scanner.nextInt();
        System.out.println("Enter number: ");
        int number3=scanner.nextInt();
        System.out.println("Enter number: ");
        int number4=scanner.nextInt();
        if (number4==-999){
            float result=getAverage3Numbers(number1,number2,number3);
            System.out.println("Result:"+result);
        }
        else {
            System.out.println("Enter number: ");
            int number5=scanner.nextInt();
            if (number5==-999){
                float result=getAverage4Numbers(number1,number2,number3,number4);
                System.out.println("Result:"+result);
            }
            else {
                float result=getAverage5Numbers(number1,number2,number3,number4,number5);
                System.out.println("Result:"+result);
            }
        }
    }


}
