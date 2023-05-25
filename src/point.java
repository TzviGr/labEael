import java.awt.*;
import java.util.Scanner;

public class point {
    double x;
    double y;

    boolean isOrigin(){
        boolean origin=false;
        if(this.x== 0 && this.y== 0){
            origin=true;
        }
        return origin;
    }
    void point(){
        System.out.println("");
    }
}

