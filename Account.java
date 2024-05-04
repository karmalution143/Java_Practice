public class Account {
    private String name;
    private double balance; //init to 0.0 NOT null

// 2 argument constructor
    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0)
          this.balance = balance;
    }

    // getters
    public String getName() {
        return this.name;
    } // getName()

    public double getBalance() {
        return this.balance;
    }  //getBalance

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}