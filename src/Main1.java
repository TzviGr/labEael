public class Main1 {
    public static void main(String[] arge) {
        Worker w1 = new Worker("Shai", "givati", 6000, 15);
        System.out.println(w1);
    }
    public static String nameCompany(Company[] companies){
        String nameCompany= "";
        int max=companies[0].totalPayments();
        for (int i = 0; i <companies.length ; i++) {
           if (max<companies[i].totalPayments()){
               nameCompany= String.valueOf(companies[i]);
           }
        }
        return nameCompany;
    }
}
