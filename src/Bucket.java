import java.util.Random;

public class Bucket {
    private int capacity;
    private int current;

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }

    public void setCurrent(int current) {
        if (current > 0) {
            this.current = current;
        }
    }
    public boolean isEmpty() {
        if (current > 0) {
            return false;
        } else if (current == 0) {
            return true;
        }
        return false;
    }
    public String toString() {
        String string="the current state the bucket: "+current+ " of "+capacity+ " liters";
        return string;
    }

    public boolean isFull() {
        boolean isFull = false;
        if (capacity > 0 && capacity == current) {
            isFull = true;
        } else if (capacity != current) {
            isFull=false;
        }
        return isFull;
    }
    public float percent() {
        if (capacity > 0) {
            this.capacity = capacity;
            this.current = current;
            float percent = 100 / capacity * current;
            return percent;
        } else {
            return 0;
        }
    }
    public boolean addLiter() {
        if (isFull()) {
            return false;
        } else {
            this.current++;
            return true;
        }
    }
    public void lustLiter() {
        this.current--;
    }
    public int addLiters(int amount) {
        int left = capacity - current + 1;
        if (amount > left) {
            return amount - left;
        } else
            return capacity;
    }
    public boolean spill() {
        boolean result=false;
        if (isEmpty()) {
            return false;
        }
        else{
            while (current>0){
                this.current--;
                result=true;
            }
        }
        return result;
    }
   public boolean spill(int amount){
       boolean result;
       int out;
       int left=capacity-current;
       if (amount > left) {
           out=amount-left;
           while (out>0) {
               out--;
           }
           result = true;
       } else{
           result=false;
       }
       return result;
   }
    public void fill(){
        while (current!=capacity){
            current++;
        }
    }
    public void fill(Bucket other){
        int left=capacity-current;
        int lust=other.current-left;
        if (other.current>left){
            this.current+=other.current-lust;
            other.current=other.current-left;
        }
    }
    Bucket reduceAmountInBuckets (Bucket[] buckets, float max){
        Bucket bucket=new Bucket();
        for (int i = 0; i <buckets.length ; i++) {
            while (buckets[i].percent()>max){
                buckets[i].lustLiter();
                bucket.addLiter();
            }
        }
        return bucket;
    }
    int[] fillExactAmount(Bucket[] buckets, int amount){
        Bucket[] buckets1=new Bucket[buckets.length];
        int count=0;
        int sum=0;
        for (int i = 0; i <buckets.length ; i++) {
            if (buckets[i].percent()>=50){
                buckets1[i]=buckets[i];
                sum+=buckets1[i].current;
                count++;
            }
        }
        int count2=0;
        int[] index=new int[count];
        for (int i = 0; i <buckets1.length ; i++) {
            if (sum==amount && buckets1[i]!=null){
                index[count2]=i;
                count2++;
            }
        }
        return index;
    }

}

