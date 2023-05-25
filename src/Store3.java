public class Store3 {
    private Delivery[] deliveries;
    private CityDelivery[] cityDeliveries;


    String CityMostExpensive(){
        double max=0;
        String result="";
        for (int i = 0; i <cityDeliveries.length ; i++) {
            if (deliveries[i].getMoney()>max){
                max=deliveries[i].getMoney();
                result=deliveries[i].getCityName();
            }
        }
        return result;
    }
    String[] namesClientsWithExpensiveDelivery(int price){
        int count=0;
        for (int i = 0; i <deliveries.length ; i++) {
            if (deliveries[i].getMoney()>price){
                count++;
            }
        }
        String[] names=new String[count];
        int counter=0;
        String name="";
        for (int i = 0; i <names.length ; i++) {
            if (deliveries[i].getMoney()>price){
                name=Character.toString(deliveries[i].getName().toUpperCase().charAt(0));
                name+=Character.toString(deliveries[i].getName().toUpperCase().split(" ")[1].charAt(0));
                names[counter]=name;
                counter++;
            }
        }
        return names;
    }
}
