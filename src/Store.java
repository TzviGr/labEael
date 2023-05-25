public class Store {
    private Client[] clients;
    private Item[] items;

    void printPurchaseListForClient(Client client){
        int price=0;
        for (int i = 0; i < this.items.length; i++) {
            price+=this.items[i].getCost();
            if (client.getBudget()==price){
                System.out.println(items[i].getName()+" "+items[i].getCost());
                break;
            }
        }
        System.out.println("no");
    }
}
