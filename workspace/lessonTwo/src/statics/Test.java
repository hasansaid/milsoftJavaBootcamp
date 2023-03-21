package Statics;

public class Test {
    public static void main(String[] args) {
        BankAccount.setRate(24);

        BankAccount account1 = new BankAccount();
        account1.setInvestment(500);
        System.out.println("Tutar: 9 aylık: " + account1.getAmount(9));
        System.out.println("Tutar 12 aylık: " + account1.getAmount());

        BankAccount.setRate(36);
        BankAccount account2 = new BankAccount();
        account2.setInvestment(800);
        System.out.println("Tutar: 9 aylık: " + account2.getAmount(9));
        System.out.println("Tutar 12 aylık: " + account2.getAmount());
    }
}
