import java.util.*;
public class ng {


    public static void main(String args[])
    {
        int n,count=1,guess;
        System.out.println("A number is generated randomly...");
        Random ran=new Random();
        n=ran.nextInt(100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess any number between 1 to 100");;
        guess=sc.nextInt();
        do{
        if(guess==n){
        System.out.println("Hurrayyy!!!you have guessed the number");
        break;
        }
        else if(guess<n){
        System.out.println("Guess it again and it is less than the generated number.. ");
         guess=sc.nextInt();
        count++;
        }
        else if(guess>n){
            System.out.println("Guess it again and it is greater than the generated number.. ");
             guess=sc.nextInt();
            count++;
            }
       }while(true);
       System.out.println("So, you have guessed" +count+ "times");    
    }
}
