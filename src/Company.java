public class Company {
    private String name;
    private Worker[] workers;

    public Worker[] getSeniorWorkers(){
        Worker[] seniors=new Worker[this.workers.length];
        for (int i = 0; i <this.workers.length ; i++) {
            if (this.workers[i].isSenior()){
                seniors[i]=this.workers[i];
            }
        }
        return seniors;
    }
    public Worker[] getNotSeniorWorkers(){
        Worker[] seniors=new Worker[this.workers.length];
        for (int i = 0; i <this.workers.length ; i++) {
            if (!this.workers[i].isSenior()){
                seniors[i]=this.workers[i];
            }
        }
        return seniors;
    }
    public Worker getHighestPaidNonSeniorWorker(){
      Worker[] nonSeniors=this.getNotSeniorWorkers();
      Worker result=nonSeniors[0];
        for (int i = 0; i <nonSeniors.length ; i++) {
            if (nonSeniors[i]!=null){
                if (nonSeniors[i].getSalary()>result.getSalary()){
                    result=nonSeniors[i];
                }
            }
        }
        return result;
    }
    public int totalPayments(){
        int sumSalary=0;
        for (int i = 0; i <this.workers.length ; i++) {
            sumSalary+=this.workers[i].getSalary();
        }
        return sumSalary;
    }
}
