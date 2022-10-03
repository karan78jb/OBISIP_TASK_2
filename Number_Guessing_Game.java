
import java.util.Random;
import java.util.*;

public class Number_Guessing_Game {
    public static void Game(){
    Random r=new Random();
    int k=r.nextInt(101);
    int count;
    Scanner scan=new Scanner(System.in);
    System.out.println("choose :- \n 1:- Limited attemp\n 2:-UnLimited attemp");
    int a=scan.nextInt();
    switch(a){
        case 1:
            count=0;
            System.out.println("There are 10 attemp to find the number ");
            
            while(count<10){
               System.out.println("Enter the number :-");
               int n=scan.nextInt();
               if(n==k){
               System.out.println("***********Congratulation you win this game***********");
               System.out.println("Your score :-"+(count+1));
               System.out.println("You Earn "+10*(10-count-1)+"point"); 
               return ;
               }
               else if(n>k){
               System.out.println("your number is Greater then random number ");
               System.out.println("Here "+(10-count-1)+" Attemp is remaining");
               
               }
               else{
               System.out.println("your number is Smaller then random number ");
               System.out.println("Here "+(10-count-1)+" Attemp is remaining");
               }
         
               count ++;
            }
            System.out.println("\n*****Better luck next time ...*****");
            Game();
        case 2:
            count=0;
            System.out.println("There many attemp to find the number ");
            
            while(true){
               System.out.println("Enter the number :-");
               int n=scan.nextInt();
               if(n==k){
               System.out.println("***********Congratulation you win this game***********");
               if((10-count-1)>0){
               System.out.println("Your score :-"+(count+1));
               System.out.println("You Earn "+10*(10-count-1)+"point");}
               else{
                 System.out.println("No point given for :-"+(count+1)+"attemp");
               }
               return ;
               }
               else if(n>k){
               System.out.println("your number is Greater then random number ");
              
               }
               else{
               System.out.println("your number is Smaller then random number ");
              }
         
               count ++;
            }
        default :
            System.out.println("Enter valid number :-");
            Game();
            
    }
    
    }
    public static void main(String []args){
    
    Game();
    
    }
}
