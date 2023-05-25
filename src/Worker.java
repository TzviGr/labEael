public class Worker {
    private String firstName;
    private String lastName;
    private int salary;
    private int years;
    public Worker(String firstName,String lastName,int salary,int years){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.years=years;
    }

    public boolean isNewWorker(){
        boolean isNew=false;
        if (this.years<=3){
            isNew=true;
        }
        return isNew;
    }
    public boolean isSenior(){
        boolean senior=false;
        if (!isNewWorker() && this.salary>=15000){
            senior=true;
        }
        return senior;
    }
    public String toString(){
        if (this.isSenior()){
            return "Worker "+this.firstName+" "+this.lastName+" is senior";
        }
        else {
            return "Worker "+this.firstName+" "+this.lastName+" is not senior";
        }
    }
    public int getSalary(){
        return this.salary;
    }
}
