public class child {
   private String name;
   private boolean boy;
   private int year;
   private int month;

    public void setName(String name) {
        this.name = name;
    }

    public boolean getBoy() {
        return this.boy;
    }
    public int getYear() {
           return this.year;
    }
    public int getMonth() {
           return this.month;
    }
   public boolean isOlder(child yearChild){
       boolean result=false;
       if (this.year>yearChild.year) {
           result = true;
       }
       return result;
   }

}
