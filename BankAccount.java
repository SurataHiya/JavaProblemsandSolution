class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:  " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error :Insufficient money to be withdrawn");
        } else if (amount <= 0) {
            System.out.println("Error: withdrawal money is zero and less than zero");
        }
        else if(amount < balance){
            balance -= amount;
            System.out.println("Withdrawn " +  amount);
        }
    }


    public void displayAccountInfo() {

        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance);

    }

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("SSH-35528", 500.00);

        myAccount.deposit(250.00);

        myAccount.withdraw(100.00);

        myAccount.displayAccountInfo();

        myAccount.withdraw(1000.00); //----> TO SHOW THE error is occuring if amount is greater than current balance
    }
}
