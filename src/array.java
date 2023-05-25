public class array {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 5, 3, 5, 8};
        int[] arr1 =  new int[]{ 3, 5, 8, 8, 6,9,9,8};
        int[] arr3=sumArray(arr,arr1);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
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
        int sum;
        for (int i = 0; i <longer ; i++) {
            int A=0;
            if (i<arr1.length){
                A=arr1[i];
            }
            int B=0;
            if (i< arr2.length){
                B=arr2[i];
            }
              sum=A+B;
            result[i]=sum;
        }
        return result;
    }
}
