class account{
    int Account_no;
    String name;
    double amount;

    void insert(int a,String n,double amt){
        Account_no = a;
        name=n;
        amount=amt;
    
    }
    void deposit (double amt){
        amount=amount+amt;
        System.out.println(amt +" "+ "Deposited");

    }
    void withdraw(double amt){
        if(amount<amt){
            System.out.println("insufficient balance");
        }
        else{amount=amount-amt;
        System.out.println(amt+" " + "withdraw");
        }
    }
 void balance_check(){
    System.out.println("Balance is" + " " + amount);
 }
void disply(){
    System.out.println(Account_no+" "+name+" "+amount);
}
}

class SavingAccount{
    public static void main(String args[]){
        account a1 =new account();
        account a2=new account();

        a1.insert(1001001001,"chali",500);
        a2.insert(2002002002,"Basavaraj",1000);

        a1.deposit(10000);
        a2.deposit(5000);

        a1.withdraw(1000.75);
        a2.withdraw(1000.35);

        a1.balance_check();
        a2.balance_check();

        a1.disply();
        a2.disply();
        a1.withdraw(10000);

        a1.deposit(2000);



    }
}