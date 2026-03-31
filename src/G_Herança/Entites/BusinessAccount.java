package G_Herança.Entites;

public class BusinessAccount extends Account {
    private Double loadLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    public void loan (Double amount){
        if (amount <= loadLimit){
            balance += amount - 10.0;
        }
    }
}
