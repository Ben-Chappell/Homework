public class BankAccount {
   public BankAccount(double initialBalance) {
      balance = initialBalance;
      if (balance < 0) {
         throw new IllegalArgumentException("Initial balance must be non-negative");
     }
   }

   public void deposit(double amount) {
      double newBalance = balance + amount;
      balance = newBalance;
      if (amount < 0) {
         throw new IllegalArgumentException("Deposit amount must be non-negative");
     }
   }

   public void withdraw(double amount) {
      double newBalance = balance - amount;
      balance = newBalance;
      if (amount < 0 || amount > balance) {
         throw new IllegalArgumentException("Invalid withdrawal amount");
     }
   }

   public double getBalance() {
      return balance;
   }

   private double balance;

   public void catchEmAll() {
      // Implement this method to catch the IllegalArgumentExceptions and handle them.
      try {
         withdraw(-2);
         //This shouldn't be reached
         System.out.println("You are depositing negative money");
      } catch (IllegalArgumentException e) {
         // TODO: handle exception
         System.out.println("You cannot deposit negative money");
      }
      try {
         deposit(-2);
         //Ditto
         System.out.println("Lmao you're broke ");
      } catch (IllegalArgumentException e) {
         // TODO: handle exception
         System.out.println("No bueno hombre");
      }
      try {
         BankAccount nb = new BankAccount(-7);
         //Ditto
         System.out.println("You;re a poor man");
      } catch (IllegalArgumentException e) {
         // TODO: handle exception
         System.out.println("Not in my town you won;t");
      }
   }
   
}
