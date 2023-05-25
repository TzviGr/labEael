import java.util.Arrays;

public class theTest {
    public static void main(String[] args) {
        System.out.println("=========1==============");
        int[] arr = new int[]{1, 2, 3, 6, 3, 44, 89, 9};
        int[] result1 = arrayStats(arr, 4);
        System.out.println(Arrays.toString(result1));
        System.out.println("=======2==========");
        String[] s1={"hellw","from","java"};
        String[] s=cleanUp(s1,'l');
        for (int i = 0; i <s.length ; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
        System.out.println("=========3==========");
        System.out.println(highestDivisor(18,12,arr));
        System.out.println("=======6========");
        System.out.println(isPermutation(12345,321456));
        }
    public static int[] arrayStats(int[] array, int number) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (number > array[i]) {
                counter1++;
            } else if (number == array[i]) {
                counter2++;
            } else if (number < array[i]) {
                counter3++;
            }
        }
        int[] arr = new int[3];
        arr[0] = counter1;
        arr[1] = counter2;
        arr[2] = counter3;
        return arr;
    }

    public static String[] cleanUp(String[] original, char toRemove) {
        String[]result={""};
        for (int i = 0; i < original.length; i++) {
            String[] words=original[i].split("");
            for (int j = 0; j < words.length; j++) {
                if (!words[j].contains(String.valueOf(toRemove))) {
                    result[j] = words[j];
                }
            }
        }
        return result;
    }

    public static int gcd(int number1, int number2) {
        int max1 = 0;
        int max2 = 0;
        int result=0;
        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                max1 = i;
                max2 = i;
            }
        }
        if (max1 == max2) {
            result = max1;
        }
        return result;
    }
    public static int highestDivisor(int number1,int number2,int[] options){
        int result=1;
        int max=gcd(number1,number2);
        for (int i = 0; i <options.length ; i++) {
            if (options[i]==max){
                result=max;
            }
        }
        return result;
    }
    public void printFactorized(int number){
        for (int i = 2; i <number ; i++) {
            if (number%i==0){
                System.out.println(number/i+"*"+i);
            }
        }
    }
    public static boolean isPermutation(int source,int target) {
        boolean bool = false;
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            if (source%10!=0) {
                arr[i] = source%10;
                source=source/10;
            }
                for (int j = 0; j < arr1.length; j++) {
                    if (target % 10 != 0) {
                        arr1[j] = target%10;
                        target = target / 10;
                    }
                    if (arr.length == arr1.length && arr[i] == arr1[j] || arr1[j] == arr[i]) {
                        bool = true;
                    }
                }
            }
        return bool;
    }
}
