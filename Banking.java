import java.util.Scanner;
public class Banking {
    String Accountholder;
    String Accountnumber;
    double balance;
    double Accountwithdrawn;
    double Accountdeposit;
    Banking (String acc, String acco, double bal, double withdr, double depos ){
Accountholder =acc;
Accountnumber = acco;
balance = bal;
Accountwithdrawn = withdr;
Accountdeposit =depos;
    }
    void deposit (double amount){
        if (amount > 0){
            balance+=amount;
            System.out.println("deposit:"+amount);
        }else{
            System.out.println("Invalid amount");
        }
    }
    void withdrawn (double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("withdrawn:" +amount);
        }else{
            System.out.println("Insufficient balance!");
        }
}
void display(){
    System.out.println("Name of account holder is:" +Accountholder);
    System.out.println("Name of account number:" +Accountnumber);
    System.out.println("Total amount:"+balance);

}
public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    try {
        System.out.println("enter account no., name, withdrawn, deposited");
        String Accountholder1 = sr.nextLine();
        String Accountnumber1 = sr.nextLine();
        double Accountwithdrawn1 = sr.nextDouble();
        double Accountdeposit1 = sr.nextDouble();
        double balance1 = sr.nextDouble();
        Banking acc = new Banking (Accountholder1, Accountnumber1, balance1, Accountwithdrawn1, Accountdeposit1);
        acc.display();
        acc.deposit(3000);
        acc.withdrawn(300);
        acc.display();
    } finally {
        sr.close();
    }
}
}