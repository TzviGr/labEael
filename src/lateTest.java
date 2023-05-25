public class lateTest {
    public static void main(String[] args) {
        System.out.println("======1=======");
        int[] arr = new int[]{12, 56, 40, 13, 21, 74};
        int[] array = lastAverage(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("======2=======");
        String s = "wert erty we ty";
        System.out.println(shorten(s));
        System.out.println("===========3============");
        int[] arr1=(arrry(90));
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("===========4============");
        System.out.println(ifArrayIsArranged(arr));
        System.out.println("===========5============");
        int[] arr2=(sumArray(arr,arr1));
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static int[] lastAverage(int[] numbers) {

        double avg = calculateAverage(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                count++;
            }
        }
        int j=0;
       int[] number = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                number[j] = numbers[i];
                j++;
            }
        }
        return number;
    }
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static String shorten(String string) {
        String smallString = "";
        String[] word = string.split(" ");
        for (int i = 0; i < word.length; i++) {
            char firstChar = word[i].charAt(0);
            if (!smallString.contains(String.valueOf(firstChar))) {
                smallString += firstChar;
            }
        }
        return smallString;
    }
    public static boolean ifArrayIsArranged(int[] array) {
        boolean arranged = false;
        int sum1 = 0;
        int sum2 = 0;
        int max1 = array[0];
        int min1 = array[0];
        int max2 = array[0];
        int min2 = 34567890;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sum1 += array[i];
                if (array[i] > max1) {
                    max1 = array[i];
                }
                if (array[i] < min1) {
                    min1 = array[i];
                }
            } else {
                sum2 += array[i];
                if (array[i] > max2) {
                    max2 = array[i];
                }
                if (array[i] < min2) {
                    min2 = array[i];
                }
            }
            if (array.length >= 4 && array.length % 2 == 0 && sum1 == sum2 && min1 < min2 && max1 < max2) {
                arranged = true;
            }
        }
        return arranged;
    }
    public static int[] sumArray(int [] arr1,int[] arr2){
        int longer;
        if (arr1.length>arr2.length){
            longer=arr1.length;
        }
        else {
            longer=arr2.length;
        }
        int[] result=new int[longer];
        for (int i = 0; i <longer ; i++) {
            int A=0;
            if (i<arr1.length){
                A=arr1[i];
            }
            int B=0;
            if (i<arr2.length){
                B=arr2[i];
            }
            result[i]=A+B;
        }
       return result;
    }
    public static int[] arrry(int num){
        int counter=0;
        int[] array=new int[num];
        for (int i = 2; i <= num; i++) {
            while (num%i==0){
                array[counter]=i;
                num=num/i;
                counter++;
            }
        }
        int[] result=new int[counter];
        for (int i = 0; i <counter ; i++) {
            result[i]=array[i];
        }
        return result;
    }
}
