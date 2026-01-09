// Attributes (also called properties or fields) are the data or characteristics of an object. 
// They represent the state of the object at any given moment. 
// Attributes are typically defined within a class and can hold different types of information related to the object.

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
            if(amount >= Balance){
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
