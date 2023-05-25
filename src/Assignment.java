public class Assignment {
    public static void main(String[] arge){
        System.out.println("==================Q1====================");
        double numberQ1=1.1234567;
        int nNumberQ1=(int) numberQ1;
        System.out.println("number is: " + numberQ1+" after cast to int: "+nNumberQ1);
        System.out.println("===================Q2===================");
        int numberQ2=42;
        double nNumberQ2=(double) numberQ2;
        System.out.println("number is: " + numberQ2+" after cast to double: "+nNumberQ2);
        System.out.println("===================Q3===================");
        int numberQ3=2147483647;
        long nNumberQ3=(long) numberQ3;
        nNumberQ3++;
        System.out.println("number is: " + numberQ3+" after addition: "+nNumberQ3);
        System.out.println("===================Q4===================");
        int numberQ4=-2147483648;
        long nNumberQ4=(long) numberQ4;
        nNumberQ4--;
        System.out.println("number is: " + numberQ4+" after addition: "+nNumberQ4);
        System.out.println("===================Q5===================");
        final double pi=3.14159;
        int radius=3;
        double Volume =  4.0 / 3.0 *pi * Math.pow(radius,3);
        System.out.printf(" the Volume is: %.5f", Volume);
        System.out.println("===================Q6===================");
        final double INCHESTOCN=2.54;
        double CM=1.80;

    }
}

