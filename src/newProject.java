import java.util.Arrays;
import java.util.Scanner;

public class newProject {
    public static void main(String[] args){
        int[] arr=new int[]{13,90,1,9,56,12};
        int[] arr1=new int[]{13,90,1,9,56,12};
      //  System.out.println(Arrays.toString(moveArrayR(arr)));
       // System.out.println(fastestCircularTransFormation(arr,arr1));
        int[] arr3=shift(arr,false,3);
       System.out.println(Arrays.toString(arr3));
    }
    public static int printHighest(int[] array){
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
   /* public static double getMedian(int[] series){
        int half=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i <series.length ; i++) {
              for (int j = 0; j <series.length ; j++) {
                if (series[i] <= series[j]) {
                    count1++;
                } else if (series[i]>=series[j]){
                    count2++;
                }
                if (count1 == count2) {
                    half=series[i];
                    return half;
                }
            }
        }
        return half;
    }*/
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
    public static boolean equalValuesArrays(int[] numbers1, int[] numbers2){
        boolean result=false;
        int count1=0;
        int count2=0;
        for (int i = 0; i <numbers1.length ; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    count1++;
                    break;
                }
            }
        }
        for (int i = 0; i <numbers2.length ; i++) {
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers2[i] == numbers1[j]) {
                    count2++;
                    break;
                }
            }
        }
        if (count1 ==numbers1.length && count2==numbers2.length) {
            result= true;
        }
        return result;
    }
    public static int[] shift(int[] array, boolean left, int shifts){
        for (int i = 0; i <shifts ; i++) {
            if (left == true) {
                    moveArrayL(array);
            }
            else {
                moveArrayR(array);
            }
        }
        return array;
    }
    public static int fastestCircularTransFormation(int[] original, int[] target){
        int result=0;
        if (original.length != target.length||!equalValuesArrays(original,target)){
            result=0;
        }
        //if ()
        return result;
    }
}
