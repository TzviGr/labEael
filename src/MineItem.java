public class MineItem {
    public static void main(String[] arge) {

    }
    public static Client cheapestList(Client[] client){
        int min=client[0].ToBay();
        Client client1=client[0];
        for (int i = 0; i <client.length ; i++) {
            if (client[i].ToBay()<min){
                client1=client[i];
            }
        }
        return client1;
    }
}
