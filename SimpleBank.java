import java.util.Scanner;

class Account {
    String name;
    double balance;

    Account(String name){
        this.name = name;
        this.balance = 0;
    }

    void deposit(double amount){ balance += amount; }
    void withdraw(double amount){
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }
    void checkBalance(){ System.out.println("Balance: " + balance); }
}

public class SimpleBank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: "); String name = sc.nextLine();
        Account acc = new Account(name);
        int choice;
        while(true){
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit: "); acc.deposit(sc.nextDouble()); break;
                case 2:
                    System.out.print("Enter amount to withdraw: "); acc.withdraw(sc.nextDouble()); break;
                case 3: acc.checkBalance(); break;
                case 4: return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
