public class AccountTest {
    public static void main(String[] args) {
      
        Account account = new Account("John Doe", 4000);

        account.deposit(2000);    
        account.withdraw(1000);    
        account.withdraw(8000);  
        account.getBalance();      
    }
}