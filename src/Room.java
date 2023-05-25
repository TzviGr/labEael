public class Room {
    private int number;
    private int type;
    private boolean available;

    public void setNumber(int number){
         this.number=number;
    }
    public void setType(int type){
        this.type=type;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    public int getType(){
       return this.type;
    }
    public boolean setAvailable() {
       return this.available;
    }
    int floor(){
        int floor=0;
        for (int i = 0; i <20 ; i++) {
            if (this.number/100==i) {
                floor = i;
                break;
            }
        }
        return floor;
    }
    int calculatePrice(){
        int price=2000;
        if (floor() > 10) {
            price += (floor()%10) * 100;
        }
        if (this.number%100<=5) {
            price += 200;
        }
        if (this.type == 2) {
            price = price * 3 / 2;
        }
        if (this.type == 3) {
            price = price * 5 / 2;
        }
        return price;
    }
}
