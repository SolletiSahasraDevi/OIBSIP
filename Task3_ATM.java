import java.util.*;
public class Task3_ATM
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i,choice;
    float cash;
    System.out.println("Enter the cash you have in the account");
    cash=sc.nextFloat();
    

    do{
       System.out.println("Enter your choice \n 1.Transaction history \n 2.Withdraw \n3.Deposit\n4.Transfer\n5.Quit\n");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: 
            {
                System.out.println(" Balance : "+ cash);
            }
            break;
            case 2:
            {
                int withdraw;
                System.out.println("Enter the amount to withdraw ");
                withdraw=sc.nextInt();
                if(withdraw>=cash)
                {
                    System.out.println("You don't have enough money to withdraw");

                }
                else{
                    cash=cash-withdraw;
                }
            }
            break;
            case 3:
            {
                int deposit;
                System.out.println("Enter the amount of cash you want to deposit");
                deposit=sc.nextInt();
                cash=cash+deposit;
            }
            break;
            case 4:
            {
                int transfer;
                System.out.println("Enter the amount of cash you want to transfer");
                transfer=sc.nextInt();
                cash=cash-transfer;
                System.out.println("Cash is transferred.");
            }
            break;
            case 5:
            System.out.println("Thanks for using the atm...");
            System.exit(0);
            
            default:
            System.out.println("SORRY PRESS ANY OTHER OPTION");
            break;
        }
    }while(true);
}
}