package fa.training.main;

import fa.training.entities.SavingAccount;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        saver1.setAnnualInterestRate(0.04);
        saver2.setAnnualInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1 =" + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver1 =" + saver2.getSavingsBalance());

        saver1.setAnnualInterestRate(0.05);
        saver2.setAnnualInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1 =" + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver1 =" + saver2.getSavingsBalance());
    }
}