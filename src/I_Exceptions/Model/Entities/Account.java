package I_Exceptions.Model.Entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account () { }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws IllegalArgumentException{
        if (withdrawLimit <= 0){
            throw new IllegalArgumentException("Withdraw Limit nao pode ser menor ou igual a 0");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        if (amount > withdrawLimit){
            throw new IllegalArgumentException("Withdraw Error: the amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Withdraw Error: Not enough balance");
        }
        balance -= amount;
    }
}
