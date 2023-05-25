import java.lang.reflect.Array;
import java.util.Arrays;

public class tyui {
    public static void main(String[] args) {

    }
    String mostProfitable(Hotel[] hotels){
        String theBastHotel="";
        int maxHotel= hotels[0].income();
        for (int i = 0; i <hotels.length ; i++) {
            if (maxHotel<hotels[i].income()){
                theBastHotel= hotels[i].getName();
            }
        }
        return theBastHotel;
    }
}

