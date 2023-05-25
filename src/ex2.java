import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        System.out.println(print_factors(56));
        char[] chars={'a','s','c','c','c','d'};
        System.out.println(findCharSqc(chars));
        }
        int[] numbers={1,2,3,4,3,3,3,4,5,6};
        int length=compress(numbers);
    public static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int[] print_factors(int num){
        int tempNum=num;
        for (int i=2;i<num;i++){
            if (tempNum%i==0){
                tempNum/=i;
            }
            if (tempNum==1){
                break;
            }
        }
        return new int[]{tempNum};
    }
    public static char findCharSqc(char[] chars){

        if (chars.length<3){
            return '\0';
        }
        else {
            for (int i=0;i<chars.length-2;i++){
                if (chars[i]==chars[i+1]&&chars[i]==chars[i+2]){
                    return chars[i];
                }
            }
        }
        return '\0';
    }
    public static int compress(int a[]) {
        int n=a.length;
        int counter=1;
        for (int i = 0; i < n-2;i++) {
            if (a[i]==0)
                break;
            for (int j=i+1;j<n;j++){
                if (a[i]==a[j]){
                    counter++;
                }else {
                    if (counter>2){
                        a[i]=counter*-1;
                        for (int k=i+2;k<n-counter-2;k++){
                            a[k]=a[k+counter-2];
                        }
                        n-=counter-2;
                        for (int j2=n;j2<a.length;j2++){
                            a[j2]=0;
                        }
                        i++;
                        break;
                    }
                }
            }
        }
        return n;
    }
}
