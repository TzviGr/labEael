public class Basketballer {
    private String name;
    int[] points;
    int[] rebounds;
    int[] assists;

    public String getName() {
        return name;
    }
    public int countDoubleDoubles() {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            int numCategoriesAboveTen = 0;
            if (points[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (rebounds[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (assists[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (numCategoriesAboveTen >= 2) {
                count++;
            }
        }
        return count;
    }
    public int countTripleDoubles() {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            int numCategoriesAboveTen = 0;
            if (points[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (rebounds[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (assists[i] >= 10) {
                numCategoriesAboveTen++;
            }
            if (numCategoriesAboveTen == 3) {
                count++;
            }
        }
        return count;
    }
}
