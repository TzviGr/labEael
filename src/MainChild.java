public class MainChild {
    public static void main(String[] args) {
    }

    public static void boysAndGirlsYears(child[] children, int year) {
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (!children[i].getBoy() && children[i].getYear() == year && children[i].getBoy() && children[i].getYear() == year) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void boysAndGirlsMonth(child[] children) {
        int countBoys = 1;
        int countGirls = 1;
        int[] monthBoys = new int[12];
        int[] monthGirls = new int[12];
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < children.length; j++) {
                if (children[j].getMonth() == i && children[j].getBoy()) {
                    monthBoys[i - 1] = countBoys;
                }
            }
            countBoys++;
        }
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < children.length; j++) {
                if (children[j].getMonth() == i && !children[j].getBoy()) {
                    monthGirls[i - 1] = countGirls;
                }
            }
            countGirls++;
        }
        int maxMonthBoys=monthBoys[0];
        for (int i = 0; i <monthBoys.length ; i++) {
            if (monthBoys[i]>maxMonthBoys){
                maxMonthBoys=monthBoys[i];
            }
        }
        int maxMonthGirls=monthGirls[0];
        for (int i = 0; i <monthGirls.length ; i++) {
            if (monthGirls[i]>maxMonthGirls){
                maxMonthGirls=monthBoys[i];
            }
        }
        System.out.println(maxMonthBoys);
        System.out.println(maxMonthGirls);
    }
    public static int averageAgeChildren(child[] children) {
        int result=0;
        int boy=0;
        int girl=0;
        int ageBoys=0;
        int ageGirls=0;
        double averageBoys;
        double averageGirls;
        for (int i = 0; i <children.length ; i++) {
            if (children[i].getBoy()){
                boy++;
            }
              else {
                  girl++;
            }
            if (children[i].getBoy()&&children[i].getYear()>0){
                ageBoys+=children[i].getYear();
            }
            else if (!children[i].getBoy()&&children[i].getYear()>0){
                ageGirls+=children[i].getYear();
            }
        }
        averageBoys=ageBoys/boy;
        averageGirls=ageGirls/girl;
        if (averageBoys>averageGirls){
            result=1;
        }
        else if (averageGirls>averageBoys){
            result=-1;
        }
        else if (averageGirls==averageBoys){
            result=0;
        }
        return result;
    }

}
