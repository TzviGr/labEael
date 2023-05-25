public class arrays {
    public static void main(String[] args){
        int[] grades=new int[1000];
       for (int i=0;i<grades.length;i++){
           grades[i]=i*2;
       }
        System.out.println(calculateAverage(grades));
    }
    public static double calculateAverage(int[] numbers){
        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        return (double) sum/numbers.length;
    }

}
