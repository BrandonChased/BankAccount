import java.util.Random;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    Random rand = new Random();
    int n = rand.nextInt((int) Math.pow(10, 10));
    private String bankNumber = String.format("%010d", n);
    private static int numOfAccounts = 0;
    private static double totalStorageOfAccounts = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalStorageOfAccounts += (savingsBalance + checkingBalance);
    }

    public static int numOfAccounts() {
        return numOfAccounts;
    }

    public static double totalStorageOfAccounts() {
        return totalStorageOfAccounts;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void getBankNumber() {
        System.out.println(this.bankNumber);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void depoMoneySavings(double depoMoney) {
        this.savingsBalance += depoMoney;
        totalStorageOfAccounts += depoMoney;
    }

    public void depoMoneyCheckings(double depoMoney) {
        this.checkingBalance += depoMoney;
        totalStorageOfAccounts += depoMoney;
    }

    public void withDrawMoneyCheckings(double removeMoney) {
        if (removeMoney > this.checkingBalance) {
            System.out.println("You dont't have enought money");
        } else {
            this.checkingBalance -= removeMoney;
            totalStorageOfAccounts -= removeMoney;
        }
    }

    public void withDrawMoneySavings(double removeMoney) {
        if (removeMoney > this.savingsBalance) {
            System.out.println("You dont't have enought money");
        } else {
            this.savingsBalance -= removeMoney;
            totalStorageOfAccounts -= removeMoney;
        }
    }

    public double totalMoney() {
        return this.checkingBalance + this.savingsBalance;
    }
}