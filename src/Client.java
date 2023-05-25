public class Client {
    private String name;
    private Item[] toBuy;
    private int budget;

    public int getBudget() {
        return this.budget;
    }

    public String getName() {
        return this.name;
    }

    public Item[] getToBuy() {
        return toBuy;
    }

    public int ToBay(){
        int price=0;
        for (int i = 0; i < this.toBuy.length; i++) {
            price += this.toBuy[i].getCost();
        }
        return price;
    }
    boolean hesEnoughBudget() {
        boolean budget = false;
        for (int i = 0; i < this.toBuy.length; i++) {
            if (this.budget>=ToBay()){
                budget=true;
            }
        }
        return budget;
    }
    double min(){
        double min=toBuy[0].getCost();
        for (int i = 0; i <toBuy.length ; i++) {
            if (toBuy[i].getCost()<min){
                min=toBuy[i].getCost();
            }
        }
        return min;
    }
}
