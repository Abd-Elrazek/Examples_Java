// bank.java
// demonstrates basic OOP syntax
// to run this program: C>java BankApp
////////////////////////////////////////////////////////////////
class BankAccount
   {
   private double balance;                   // account balance

   public BankAccount(double openingBalance) // constructor
      {
      balance = openingBalance;
      }

   public void deposit(double amount)        // makes deposit
      {
      balance = balance + amount;
      }

   public void withdraw(double amount)       // makes withdrawal
      {
      balance = balance - amount;
      }

   public void display()                     // displays balance
      {
      System.out.println("balance=" + balance);
      }
   }  // end class BankAccount
////////////////////////////////////////////////////////////////
class BankApp
   {
   public static void main(String[] args)
      {
      BankAccount ba1 = new BankAccount(100.00); // create acct

      System.out.print("Before transactions, ");
      ba1.display();                         // display balance

      ba1.deposit(74.35);                    // make deposit
      ba1.withdraw(20.00);                   // make withdrawal

      System.out.print("After transactions, ");
      ba1.display();         
       // display balance
	   
	   change_(ba1);
	   
      }  // end main()
    public static void change_(BankAccount ba3){
		ba3 = new BankAccount(99.00);
		System.out.println("before");
		ba3.display();
		ba3.deposit(3);
		ba3.withdraw(1);
		System.out.println("After");
		ba3.display();
	}
   }  // end class BankApp
   
