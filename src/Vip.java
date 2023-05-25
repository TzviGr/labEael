public class Vip {
    private Client[] vip;


    public double friend(){
        double result=0;
        double result1=0;
        double result2=0;
        for (int i = 0; i <vip.length ; i++) {
            if (vip[i].getToBuy().length < 10) {
                result2 = vip[i].min() - vip[i].min() * 5 / 100;
            } else {
                result = vip[i].min() - vip[i].min() * 20 / 100;
                result1 = vip[i].ToBay() - vip[i].ToBay() * 5 / 100;
            }
            if (result1<result){
                result2= result1;
            }
            else if (result<result1){
                result2=result;
            }
        }
        return result2;
    }
}
