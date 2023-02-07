public class Main {
    public static void main(String[] args) {
        BankAccount Brandon = new BankAccount(400, 500);
        BankAccount Taylor = new BankAccount(400, 500);
        System.out.println(Brandon.totalMoney());
        System.out.println(BankAccount.totalStorageOfAccounts());
        System.out.println(BankAccount.numOfAccounts()); 
        Taylor.depoMoneyCheckings(599);
        Taylor.withDrawMoneySavings(1);
        System.out.println(Taylor.totalMoney());
    }
}
