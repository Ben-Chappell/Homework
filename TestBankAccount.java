public class TestBankAccount {
    public static void main(String[] args) {
        try {
            BankAccount b1 = new BankAccount(-1);
            System.out.println("Error: expected exception for negative initial balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for negative initial balance");
        }

        try {
            BankAccount b2 = new BankAccount(100);
            b2.deposit(-1);
            System.out.println("Error: expected exception for negative deposit amount");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for negative deposit amount");
        }

        try {
            BankAccount b3 = new BankAccount(100);
            b3.withdraw(-1);
            System.out.println("Error: expected exception for negative withdraw amount");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for negative withdraw amount");
        }

       
    }
}
