import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bucket b1 = new Bucket();
        b1.setCapacity(7);
        b1.setCurrent(0);
        System.out.println(b1.toString());
        System.out.println(b1.isEmpty());
        System.out.println(b1.isFull());
        System.out.println("The percent is: " + b1.percent());
        System.out.println(b1.addLiter());
        System.out.println(b1.addLiters(11));
        System.out.println(b1.spill());
        System.out.println(b1.spill(11));
        b1.fill();
        System.out.println(b1);
        Bucket b2 = new Bucket();
        b2.setCapacity(5);
        b2.setCurrent(0);
        b1.fill(b2);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}