package entities;

import exeception.BusinessException;

public class Account {

    private Integer number;
    private String holde;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holde, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holde = holde;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolde() {
        return holde;
    }

    public void setHolde(String holde) {
        this.holde = holde;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposi(double amount) {
        validateWithdraw(amount);
        balance += amount;
    }
    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque.");
        }
        if (amount > getBalance()){
            throw new BusinessException("Erro de saque: Saldo insuficiente.");
        }
    }
}
