public class Race {
    private int price;
    private boolean vip;
    private Racer[] racers;

    public Race(int price, boolean vip, Racer[] racers) {
        this.price = price;
        this.vip = vip;
        this.racers = racers;
    }

    boolean addRacer(Racer toad) {
        boolean yes = false;
        if (this.vip && toad.getName().charAt(0) == 'x' && toad.getCar().getYear() >= 2020) {
            yes = true;
        }
        else if (toad.getCar().getYear() >= 2015) {
            yes = true;
        }
        Racer[] racers1 = new Racer[racers.length + 1];
        for (int i = 0; i < racers1.length; i++) {
            if (yes == true) {
                racers1[racers1.length - 1] = toad;
                racers1[i] = racers[i];
            }
        }
        return yes;
    }
    String getMinModel(){
        int min=racers[0].getAge();
        String model=racers[0].getCar().getModel();
        for (int i = 0; i <racers.length ; i++) {
            if (racers[i].getAge()<min){
                min=racers[i].getAge();
                model=racers[i].getCar().getModel();
            }
        }
        return model;
    }
}
