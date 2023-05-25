public class Delivery {
    private double cost;
    private String address;
    private String name;
    private CityDelivery[] cityDelivery;
    private Delivery[] deliveries;
     String setAddress(String r,int home,String c){
         return this.address=r+" "+home+", "+c;
    }
    String getCityName(){
       String city="";
       String[] text=this.address.split(",");
       city=text[1];
        return city;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
    int getCountOfDelivery(){
        int count=0;
        for (int i = 0; i <deliveries.length ; i++) {
            count++;
        }
        return count;
    }
    double getMoney(){
        double sum=0;
        for (int i = 0; i <cityDelivery.length ; i++) {
            if (getCountOfDelivery()<10){
                sum=cityDelivery[i].getDestansFromStoreToCity()*4.5;
            }
            else {
                sum=(cityDelivery[i].getDestansFromStoreToCity()*4.5)/10.0;
            }
        }
        return sum;
    }
}
