import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        Random r=new Random();
        int ans=r.nextInt(100) + 1;
        boolean flag=false;
        int attempt=0,maxattempt=10;
        System.out.println("Welcome to the Number Game");
        while(attempt<maxattempt && !flag ){
            System.out.println("Attempts = "+ (attempt+1) + "\nEnter a number between 1 and 100 ");
            int guess=o.nextInt();
            if(guess<1 || guess>100)
            {
               System.out.println("Please choose the number between 1 and 100 ");
               continue;
            }
            attempt++;
            
            if(guess<ans){
                System.out.println("Your answer is too low");
            }
            else if(guess>ans){
                System.out.println("Your answer is too high");
            }
            else{
                flag=true;
                System.out.println("Congratulations!!! You won the game");
                break;
            }
        }
        if(!flag){
            System.out.println("Sorry, you ran out of the attempts.The answer was: "+ ans);
        }
        
    }
}
