import java.util.Scanner;

public class question1 {
    public static void main(String[] agre) {
        //System.out.println("====================2================");
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the length: ");
        //int length = scanner.nextInt();
        // System.out.println("Enter the width: ");
        // int width = scanner.nextInt();
        //int scope = 2 * length + 2 * width;
        //int area = length * width;
        // System.out.println("The scope is:" + scope);
        //System.out.println("The area is:" + area);
        //System.out.println("=================9===================");
        //System.out.println("Enter the number: ");
        //int number=scanner.nextInt();
        // if (number/100<1){
        // int dozens=number/10;
        // int singularity=number%10;
        //  int sum=dozens+singularity;
        //   System.out.println("the sum is:" + sum);
        // }
        // System.out.println("==============11===========");
        // System.out.println("enter a number: " );
        // int number1=scanner.nextInt();
        //  int number2=scanner.nextInt();
        //     int number3=scanner.nextInt();
//        int sum =number1+number2+number3;
        //if (sum>500){
        // int sum2=sum*10/100;
        //int sum3=sum-sum2;
        //  System.out.println("the sum is: " +sum3);
        //}
        //else {
        // System.out.println("the sum is: "+sum);
        //}
        //  System.out.println("==============15===========");
        // System.out.println("enter a number: " );
        // int number4=scanner.nextInt();
        // if (number4/100>1){
        //    int centuries=number4/100;
        //   int dozens=(number4/10)%10;
        //  int singularity=number4%10;
        //   if (dozens>centuries&&dozens-centuries==1&&singularity>dozens&&singularity-dozens==1||centuries>dozens&&centuries-dozens==1&&dozens>singularity&&dozens-singularity==1){
        //     System.out.println("Positive");
        // }
        //  else {
        //    System.out.println("Negative");
        //  }
        //}
        //   System.out.println("================19============");
        //  System.out.println("Enter the number: ");
        //int number = scanner.nextInt();
        // if (number / 100 < 1 && number > 9){
        //  int dozens = number / 10;
        //int singularity = number % 10;
        //   while (dozens != singularity) {
        //  System.out.println("Enter the number again: ");
        //  int number1 = scanner.nextInt();
        //}
        // }
        // System.out.println("================21============");
        // System.out.println("Enter the number: ");
        // int number = scanner.nextInt();
        // int count=0;
        //   while (number % 10 != 0) {
        //      number = number / 10;
        //     count++;
        // }
        // System.out.println(count);
        // System.out.println("================23============");
        //System.out.println("Enter the nice number: ");
        // int niceNumber = scanner.nextInt();
        // int lastNumber = niceNumber % 10;
        // int firstNumber = niceNumber;
        // while(firstNumber >= 10)
        //   {
        //    firstNumber = firstNumber / 10;
        // }
        // boolean num=false;
        //niceNumber(niceNumber,lastNumber,firstNumber,num);
        // System.out.println(num);
        //    }
        //public static boolean niceNumber(int niceNumber, int lastNumber, int firstNumber,boolean num){
        // num = false;
        //  lastNumber = niceNumber % 10;
        // firstNumber = niceNumber;

        //if (lastNumber==firstNumber){
        // num = true;
        // }
        //  else {
        // num=false;
        // }
        // return num;
        //System.out.println("================25============");
        //System.out.println("Enter a number: ");
        // int number1 = scanner.nextInt();
        //System.out.println("Enter a number: ");
        // int number2 = scanner.nextInt();
        //int num=0;
        // int count=0;
        //while (number1%10!=0) {
        //  num=number1%10;
        // number1 = number1 / 10;
        //   if (number2==num){
        //         count++;
        //       }
        //    }
        //  System.out.println(count);
        /* System.out.println("================25============");
        System.out.println("please enter size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("please enter a number ");
        int number = scanner.nextInt();
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            System.out.print(arr[i]+ " ,");
        }
        System.out.println("]");*/
        int[] arr = new int[]{5, 5, 5, 3, 5, 8, 8, 6, 5, 4};
        int[] arr1 = array3index(arr,5);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }

        System.out.println("====9============");

        System.out.println(getMaxNumber(arr));
        System.out.println(getCountInArray(arr, 5));
        //System.out.println(getNumberIfArray1_ToArray2(arr, arr1));
        arr = (printArrayWithoutTheNumber(arr, 5));
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        //System.out.print(array(arr,arr1));
        System.out.println("=================");
        System.out.println(arr1);

    }

    public static int getMaxNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getCountInArray(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

    public static int[] printArrayWithoutTheNumber(int[] arr, int number) {
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            if (arr[i] != number)
                array[i] = arr[i];
        }
        return array;
    }

    public static int getNumberIfArray1_ToArray2(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sum1 += array1[i];
                sum2 += array2[j];
            }
        }
        if (sum1 > sum2) {
            return 1;
        } else if (sum1 < sum2) {
            return 2;
        } else
            return 0;
    }

    public static int[] array(int[] A, int[] B) {
        int[] newArray= A;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    newArray=A;
                }
            }
        }
        return newArray;
    }
    public static int number(int[] array,int num){
        int indexNum=0;
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
            if (sum!=num){
                indexNum=-1;
            }
            else {
                 indexNum=i;
                 break;
            }
        }
        return indexNum;
    }
    public static int[] array3index(int[] array,int num){
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<num){
                count1++;
            }
            else if (array[i]==num){
                count2++;
            }
            else if (array[i]>num){
                count3++;
            }
        }
        int[] result=new int[3];
            result[0]=count1;
            result[1]=count2;
            result[2]=count3;
        return result;
    }
    public static boolean equalValuesArrays(int[] numbers1, int[] numbers2){
        boolean v=false;
        for (int i = 0; i <numbers1.length ; i++) {
            for (int j = 0; j <numbers2.length; j++) {
                if (numbers1[0]==numbers2[j]&&numbers2[0]==numbers1[i]){
                    v=true;
                }
            }
        }
        return v;
    }

}

