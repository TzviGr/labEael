public class Candidate {
    private int year;
    private int price;
    private int average;
    private String[] know;

    public Candidate(int year,int price,int average,String[] know){
        this.year=year;
        this.price=price;
        this.average=average;
        this.know=know;
    }
    public String toString(){
        return ""+year+" "+average+" "+price;
    }
    public String[] getKnow() {
        return this.know;
    }

    public int getAverage() {
        return average;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    int suitableApplicant(){
        int number=0;
        for (int i = 0; i <this.know.length ; i++) {
            if (this.average>=80&&getKnow().length>=2&&this.price<16000) {
                number=1;
            }
            else if (this.year>=3&&getKnow().length>=3&&this.price<30000) {
                number=2;
            }
        }
        return number;
    }

}
