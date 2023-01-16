import java.util.Scanner;

public class Lab4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Checking checking = new Checking(0);
        Savings savings = new Savings(500);
        int choice;
        float withdraw,deposit;
        do {
            System.out.println("""
                    1. Withdraw from Checking
                    2. Withdraw from Savings
                    3. Deposit to Checking
                    4. Deposit to Savings
                    5. Balance of Checking
                    6. Balance of Savings
                    7. Award Interest to Savings now
                    8. Quit""");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    withdraw=sc.nextFloat();
                    checking.withdraw(withdraw);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    withdraw=sc.nextFloat();
                    savings.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    deposit=sc.nextFloat();
                    checking.deposit(deposit);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    deposit=sc.nextFloat();
                    savings.deposit(deposit);
                    break;
                case 5:
                    System.out.println("Your balance for checking "+checking.getNumber()+" is "+checking.getBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings "+savings.getNumber()+" is "+savings.getBalance());
                    break;
                case 7:
                    savings.interest();
                    break;
            }

        } while (choice != 8);
    }
    static public class Account{
        int number=10001;
        private float balance;
        public Account(){
        }
        public Account(float nBalance){
            balance=nBalance;
        }
        public int getNumber(){
            return number;
        }
        public float getBalance(){
            return balance;
        }
        public void setBalance(float nBalance){
            balance=nBalance;
        }
        public void withdraw(float withdraw){
            balance-=withdraw;
        }
        public void deposit(float deposit){
            balance+=deposit;
        }
    }
    static class Checking extends Account{
        public Checking(float nBalance){
            setBalance(nBalance);
        }
        public void withdraw(float withdraw){
            if(getBalance()-withdraw<0){
                System.out.println("Charging a fee of $20 because you are below $0");
                setBalance(getBalance()-(withdraw+20));
            }
            else{
                setBalance(getBalance()-withdraw);
            }
        }
    }
    static class Savings extends Account{
        int counter=1;
        public Savings(float nBalance){
            number=10002;
            setBalance(nBalance);
        }
        public void withdraw(float withdraw){
            if(getBalance()-withdraw<500) {
                System.out.println("Charging a fee of $10 because you are below $500");
                setBalance(getBalance()-(withdraw+10));
            }
            else{
                setBalance(getBalance()-withdraw);
            }
        }
        public void deposit(float deposit){
            setBalance(getBalance()+deposit);
            System.out.println("This is deposit "+counter+" to this account");
            counter++;
            if(counter>=6){
                System.out.println("Charging a fee of $10");
                withdraw(10);
            }
        }
        public void interest(){
            double interest=(getBalance()*1.015)-getBalance();
            System.out.println("Customer earned "+interest+" in interest");
            setBalance(getBalance()+(float)interest);
        }
    }
}
