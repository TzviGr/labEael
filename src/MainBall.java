public class MainBall {
    public static void main(String[] args) {

    }
    public static String getMaxTripleDoubler(Basketballer[] players){
        int max=players[0].countTripleDoubles();
        String name="";
        for (int i = 0; i <players.length ; i++) {
            if (players[i].countTripleDoubles()>max) {
                max = players[i].countTripleDoubles();
                name=players[i].getName();
            }
        }
        return name;
    }
}
