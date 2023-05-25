public class exercise4 {
    public static void main(String[] agrs) {

        System.out.println("start");
        whichIsBigger(14, 54);
        System.out.println("end");
        System.out.println("start");
        printNumbers(5, 19);
        System.out.println("end");
        System.out.println("start");
        drawSquare(6);
        drawSquare(2);
        drawSquare(7);
        System.out.println("end");
        float average=calcvlateAverage(16.2F,4.5F,6.89F);
        System.out.println(average);

    }

    public static void printNumbers(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static void whichIsBigger(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("Number1");
        } else if (number2 > number1) {
            System.out.println("Number2");
        } else {
            System.out.println("Number1=Number2");
        }
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
        }
            System.out.println("-");
        }
    public static float calcvlateAverage(float num1, float num2, float num3) {
        float sum=num1+num2+num3;
        float average=sum/3;
        return average;
    }

}



