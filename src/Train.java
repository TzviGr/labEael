public class Train {
    private String destination;
    private int[] departure=new int[2];
    private int duration;
    private int passengers;
    private int seats;
    private int price;

    public int getPassengers() {
        return passengers;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeats() {
        return seats;
    }

    public int[] getDeparture() {
        return departure;
    }

    public Train(String destination, int[] departure, int duration, int passengers, int seats, int price) {
        this.destination = destination;
        this.departure[1]=departure[1];
        this.departure[2]=departure[2];
        this.duration=duration;
        this.passengers=passengers;
        if (this.passengers<=this.seats){
            this.seats = seats;
        }
        this.price=price;
    }
    boolean equals(Train anther){
        boolean equals=false;
        if (anther.getDestination()==getDestination()&&anther.getDeparture()==getDeparture()&&anther.getSeats()==getSeats()){
            equals=true;
        }
        return equals;
    }
    boolean addPassengers(int num){
        boolean add;
        int result=this.seats-this.passengers;
        if (result>=num){
            this.passengers+=num;
            add=true;
        }
        else {
            add=false;
        }
        return add;
    }
    public boolean isFull() {
        boolean isFull = false;
        if (this.passengers > 0 && this.passengers == this.seats) {
            isFull = true;
        } else if (this.passengers != this.seats) {
            isFull=false;
        }
        return isFull;
    }
    boolean isCheaper(Train anther){
        boolean isCheaper=false;
        if (anther.price>this.price){
            isCheaper=true;
        }
        return isCheaper;
    }
    int totalPrice(){
        int sum=this.price*this.passengers;
        return sum;
    }
}
