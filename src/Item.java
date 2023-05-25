public class Item {
    private String name;
    private double cost;
    private int count;
    public double getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }
    boolean existsInInvert(){
        boolean exists=false;
        if (this.count>0){
            exists=true;
        }
        return exists;
    }
    int decrementCount(int amount){
        int result;
        if (this.count-amount>0){
            this.count=this.count-amount;
            result=0;
        }
        else {
            this.count=0;
            result=this.count-amount;
        }
        return result;
    }

}
