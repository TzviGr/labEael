import java.util.Arrays;

public class MainCandidate {
    public static void main(String[] args) {
        String s1 = "tyui";
        String s3 = "iut";
        String s2 = "tyui";
        String[] s = {s3, s1, s2};
        String[] s4 = {s3, s1};
        String[] s5 = {s3};
        Candidate candidate = new Candidate(2, 15000, 90, s4);
        Candidate candidate1 = new Candidate(4, 25000, 75, s);
        Candidate candidate2 = new Candidate(1, 10000, 60, s5);
        Candidate[] candidates = {candidate, candidate1, candidate2};
        System.out.println(candidate.suitableApplicant());
        System.out.println(mostSuitable(candidates,0).toString());
    }
   public static Candidate mostSuitable(Candidate[] candidates, int type) {
        int maxA = candidates[0].getAverage();
        int maxY = candidates[0].getYear();
        int minP = candidates[0].getPrice();
        Candidate candidate = candidates[0];
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getAverage() > maxA) {
                maxA = candidates[i].getAverage();
            }
            if (candidates[i].getYear() > maxY) {
                maxY = candidates[i].getYear();
            }
            if (candidates[i].getPrice() < minP) {
                minP = candidates[i].getPrice();
            }
            if (candidates[i].suitableApplicant() == 1 && type == 1&&candidates[i].getAverage() == maxA) {
                candidate= candidates[i];
            }
            else if (candidates[i].suitableApplicant() == 2 && type == 2&&candidates[i].getYear() == maxY) {
                candidate = candidates[i];
            }
            else if (candidates[i].suitableApplicant() == 0 && type == 0&&candidates[i].getPrice() == minP) {
                candidate = candidates[i];
            }
        }
        return candidate;
    }
}
