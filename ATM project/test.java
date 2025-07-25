import java.util.Scanner;
public class test {
  private double balance;
  public test(double intialbalance){
    this.balance=intialbalance;
  }
  public void checkbalance(){
    System.out.println("your current balance:"+balance);
  
  }
  public void withdraw(double amount){
    if(amount<=0)
    {
      System.out.println("invalid amount: please Enter positive value");
  }
    else if(amount>balance){
      System.out.println("insufficient balance: ypur amount is:"+amount);
    }
    else{
      balance-=amount;
      System.out.println("collect your cash:"+amount);
      System.out.println("Remaining balance"+balance);
    }
  }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    test atm=new test (10000);
    while(true){
      System.out.println("\n===ATM Machine");
      System.out.println("1.check balance");
       System.out.println("2.Withdraw cash");
        System.out.println("3.Exist");
         System.out.println("choose option 1-3");
         int choice=scan.nextInt();
         
         
         
         
         switch( choice){
          case 1:
            atm.checkbalance();
            break;
            case 2:
            System.out.println("Enter the amount withdraw:");
            double amount=scan.nextDouble();
            atm.withdraw(amount);
            break; 


            case 3:
            System.out.println("Thank you visit again");
            scan.close();
            System.exit(0);
            default: 
            System.out.println("invalid option! please try  again");          
         }
      
      
      

    }
    }
}
