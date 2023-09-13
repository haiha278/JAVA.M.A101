package fa.training.entities;

public class SavingAccount {
    private double annualInterestRate;
    private double savingsBalance;

    public SavingAccount() {
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    public SavingAccount(double annualInterestRate, double savingsBalance) {
        this.annualInterestRate = annualInterestRate;
        this.savingsBalance = savingsBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double calculateMonthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance = savingsBalance + calculateMonthlyInterest;
        return calculateMonthlyInterest;
    }
}
