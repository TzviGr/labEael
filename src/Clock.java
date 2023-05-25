public class Clock {
    private int minutes,hours;

    public  int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes>=0 && minutes<60)
        this.minutes = minutes;
    }

    public int getHours() {
        return this.hours;
    }
    public void setHours(int hours) {
        if (hours>=0 && hours<24)
        this.hours = hours;
    }
    public String toString() {
        return this.hours+":"+this.minutes;
    }
    public int timeToMidnight(){
        int timeToMidnight=(23-this.hours)*60;
        timeToMidnight+=60-this.minutes;
        return timeToMidnight;
    }
    public void addMinutes(int minutes){
        int H=minutes/60;
        int M=minutes%60;
        this.hours+=H;
        this.minutes+=M;
    }
    public void print(boolean amPm){
        int H=this.hours;
        if (amPm==true){
            H-=12;
            System.out.println(H+":"+this.minutes);
        }
        else {
            System.out.println(this.hours+":"+this.minutes);
        }
    }
}
