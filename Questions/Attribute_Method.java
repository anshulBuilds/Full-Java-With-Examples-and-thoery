// Attributes (also called properties or fields) are the data or characteristics of an object. 
// They represent the state of the object at any given moment. 
// Attributes are typically defined within a class and can hold different types of information related to the object.

// Practice (Attributes and Methods)
// Medium

// Design a class BankAccount with the following specification :

// Attributes :

// accountNumber (string) : Represents the account number of the user's account
// balance (double) : Represents the balance of the account
// Constructor :

// Implement a parameterised constructor to have the accountNmber and balance initialised while creating the object.
// Methods :

// deposit (double amount) : It adds the amount to the balance of the user's account.
// withdraw (double amount) : It deduct the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
// displayDetails() : It diplays th accuntNumber and balance of the account.


// Refer the sample examples for understanding the output format.



// Note :

// Use the exact output format given in example with matching case and whitespaces else may face wrong answers.

// Use the name convention for classes and methods as given in the IDE commented code or the problem statement to avoid the compilation error.

// All outputs should always be displayed with exactly 2 decimal places.


// Example 1

// Input : accountNumber = "9662375274869" , balance = 8655 , addBalance = 5854 , withdrawBalance = 9437

// Output :

// Account Number : 9662375274869

// Balance : 5072.00

// Explanation :

// The object of the class BankAccount is created using the parameterised constructor with accountNumber and balance as the two arguments to constructor.
// Then the deposit() method is called with parameter addBalance.
// Next the withdrawbalance() method is called with parameter withdrawBalance, Here the withdrawal balance is 9437 and Balance is 14509. So we can withdraw the given amount.
// Next the displayDetails() method is called which displays the account number and balance present in the account.
// Example 2

// Input : accountNumber = "9662375274869" , balance = 8655 , addBalance = 10, withdrawBalance = 9437

// Output :

// Insufficient funds!

// Account Number : 9662375274869

// Balance : 8665.00

// Explanation :

// The object of the class BankAccount is created using the parameterised constructor with accountNumber and balance as the two arguments to constructor.
// Then the deposit() method is called with parameter addBalance.
// Next the withdrawbalance() method is called with parameter withdrawBalance, Here the withdrawal balance is 9437 and Balance is 8665. So we cannot withdraw the given amount so print "Insufficient funds!".
// Next the displayDetails() method is called which displays the account number and balance present in the account.


// Consider the following class implementing the BankAccount in real-world:

class BankAccount{
    String Name = null;      //Empty String if no name is provided
    protected String AccountNumber;
    private double Balance = 1000.0;     //Default balance is 1000.0

      BankAccount(String UserName , String AC_Number , double Bal){
        this.Name= UserName;   
        this.AccountNumber= AC_Number;
        this.Balance = Bal;
      }

      BankAccount(String UserName, String AC_Number){
        this.Name= UserName;   
        this.AccountNumber= AC_Number;
      }

        void deposit(double amount){
          if(amount > 0){
            this.Balance += amount;
            System.out.println("Amount Deposited Successfully");
          }
          else{
            System.out.println("Deposit can't be Possible Invalid Amount");
          }
        }

          void withdraw(double amount){
            if(amount <= Balance){
              Balance -= amount;
              System.out.println("Amount Withdrawn Successfully");
            }
            else{
              System.out.println("Insufficient Balance in Your Account");
            }
          }

        void displayAccountInfo(){
            System.out.println("Account Holder Name: " + this.Name);
            System.out.println("Account Number: " + this.AccountNumber);
            System.out.println("Account Balance: " + this.Balance);
        }

}

public class Attribute_Method {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Anshul" , "AC12345");
        user1.deposit(150.0);
        user1.displayAccountInfo();

        System.out.println("------------------------------");

        user1.withdraw(100.0);
        user1.displayAccountInfo();
    }
}

