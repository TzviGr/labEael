public class Hotel {
    String name;
    Room[] rooms;


    Room[] arrayRooms(int type, int budget){
        int count=0;
        Room[] result=new Room[this.rooms.length];
        for (int i = 0; i <this.rooms.length ; i++) {
            if (this.rooms[i].getType()==type && budget<=this.rooms[i].calculatePrice() &&this.rooms[i].setAvailable()){
               count++;
            }
        }
        Room[] rooms1=new Room[count];
        int counter=0;
        for (int i = 0; i <this.rooms.length ; i++) {
            if (this.rooms[i].getType()==type && budget<=this.rooms[i].calculatePrice() &&this.rooms[i].setAvailable()){
                rooms1[counter]=this.rooms[i];
                counter++;
            }
        }
        return rooms1;
    }
    int income(){
        int income=0;
        for (int i = 0; i <this.rooms.length ; i++) {
            if (!this.rooms[i].setAvailable()){
                income+=this.rooms[i].calculatePrice();
            }
        }
        return income;
    }

    public String getName() {
        return name;
    }
}
