import java.util.Arrays;

public class Sample_test {
    public static void main(String[] args) {
        System.out.println("===========ex1===1=============");
        int[] arr = new int[]{9, 5, 5, 5, 5, 9, 5, 5, 5, 6};
        double[] array1 = getAnArrayOf3Members(arr);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("===========ex1====2===========");
        String S1 = "how ball is coool";
        System.out.println(removeConsecutiveDuplicates(S1));
        System.out.println("===========ex1====3==========");
        System.out.println(maxNumber(80));
        System.out.println(theSameNumber(85, 51));
        System.out.println("===========e1==4=============");
        String S = "hoWhoWhoW";
        System.out.println(isTriangleText(S));
        System.out.println("===========ex1====5==========");
        int[] array = (moveArrayR(arr));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = (moveArrayL(arr));
       //for (int i = 0; i < array.length; i++) {
       //    System.out.print(array2[i] + " ");
       // }
        System.out.println(Arrays.toString(array2));
        System.out.println();
       // System.out.println(Characters(S));
        System.out.println("===========ex2===4============");
        double[] arr2 = {4.9, 7.0, 9.34, 9.9, 9};
        boolean[] arr3 = ifInt(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println("===========e1==5=============");
        int[] array6 = (words(S));
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("===========ex2===7============");
        int[] arr5={30,31,3};
        System.out.println(isMagicalArray(arr5));

        System.out.println("===========ex2===8============");
        String[] S2 = {"how", "ball","is","cool"};
        ifString(S2);
        System.out.println();
        System.out.println("===========ex2===9============");
        System.out.println(ifArrayIsArranged(arr));
        System.out.println("===========ex2===10============");
        System.out.println(smallString(S1));
    }

    public static int getMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static double[] getAnArrayOf3Members(int[] arr) {
        int a = getMaxNumber(arr);
        int b = getMinNumber(arr);
        double c = calculateAverage(arr);
        return new double[]{a, b, c};
    }

    public static String removeConsecutiveDuplicates(String string) {
        String result="";
        String newString = "";
        for (int i = 0; i < string.length() -1; i++) {
            if (string.charAt(i) != string.charAt(i + 1)&&string.charAt(string.length()-1)!=string.charAt(string.length()-2)) {
                newString = newString + string.charAt(i);
                result=newString+string.charAt(string.length()-1);
            }
        }
        return result;
    }

    public static int divisionArray(int number) {
        int newNumber = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                newNumber = i;
        }
        return newNumber;
    }

    public static boolean theSameNumber(int number1, int number2) {
        boolean same;
        int num1 = divisionArray(number1);
        int num2 = divisionArray(number2);
        if (num1 == num2) {
            return same = true;
        } else
            return same = false;
    }

    public static int[] moveArrayR(int[] array) {
        int[] arr = new int[array.length];
        arr[0] = array[array.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = array[i - 1];
        }
        return arr;
    }
    public static int[] moveArrayL(int[] array) {
        int[] arr = new int[array.length];
        arr[array.length-1] = array[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = array[i + 1];
        }
        return arr;
    }

    public static boolean[] ifInt(double[] arr) {
        boolean[] array = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 1 == 0) {
                array[i] = true;
            } else
                array[i] = false;
        }
        return array;
    }

    public static boolean ifArrayIsArranged(int[] array) {
        boolean arranged = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= (array.length-1 )/ 2) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }
        if (array.length >= 4 && array.length % 2 == 0 && sum1 == sum2) {
            arranged = true;
        }
        return arranged;
    }
    public static void ifString(String[] string){
        for (int i=0;i<string.length;i++){
            if (string[i].length()%2==0){
                System.out.print(string[i].charAt(0)+" ");
            }
            else{
                System.out.print(string[i].charAt(string[i].length()-1)+" ");
            }
        }
    }
    public static boolean isTriangleText(String text){
        boolean result=false;
        int triangle=text.length()/3;
        String text1="";
        String text2="";
        String text3="";
        for (int i=0;i<text.length();i++){
            if (i<triangle){
                text1+= text.charAt(i);
            }
           else if (i<2*triangle){
                text2+= text.charAt(i);
            }
            else if (i<3*triangle){
                text3+=text.charAt(i);
            }

            }
        for (int j=0;j<text1.length();j++){
            if (text1.charAt(j)==text2.charAt(j)&&text2.charAt(j)==text3.charAt(j)) {
                result = true;
            }
            }
        return result;
    }
    public static String smallString(String string){
        String smallString="";
        boolean v=true;
        for (int i=0;i<string.length()-1;i++){
            if (string.charAt(i)==' '){
                v=true;
            }
             if (string.charAt(i)!=' '&& v==true){
                smallString +=string.charAt(i)+".";
                v=false;
            }
        }
        return smallString;
    }
    public static String Characters(String text){
        String characters="";
        String result="";
       //for (int j=0;j<text.length();j++){
      //  }
        for (int i=0;i<text.length()-1;i++){
            if (text.charAt(i) != text.charAt(i + 1)&&text.charAt(text.length()-1)!=text.charAt(text.length()-2)) {
                characters = characters +text.charAt(i);
                result=characters+text.charAt(text.length()-1);
            }
        }
        return result;
    }
    public static int maxNumber(int number){
        int max=0;
        for (int i=1;i<number;i++) {
            if (number % i == 0) {
                max=i;
            }
        }
        return max;
    }
    public static boolean isMagicalArray(int[] numbers) {
        int sum;
        for (int i=0;i<numbers.length;i++) {
            sum = 0;
            while (numbers[i] > 0) {
                sum += numbers[i] % 10;
                numbers[i] /= 10;
            }
            if (sum != numbers.length) {
                return false;
            }
        }
        return true;
    }
    public static int[] words(String string){
        int count1=0;
        int count2=0;
        for (int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if (ch >= 'A' && ch<= 'Z') {
                count1++;
            } else {
                count2++;
            }
        }
        int[] number= new int[]{count1, count2};
        return number;
    }
       public static String Words(String text){
        String result="";
        return result;
       }
}


