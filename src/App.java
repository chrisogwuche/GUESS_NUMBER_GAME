import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class App {
    public static int guess;
    public static int mode;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int cmp = rand.nextInt(1,100);
        
        while(true){
            System.out.print("Select your difficulty.\nEnter 1 for Hard mode or Enter 2 for Easy mode: ");
            mode = sc.nextInt();
            if( mode < 3){
                break;
            }
        }
        if(mode == 1){
             int i = 0;
             while(i<6 ){
                System.out.print("Guess a number from 1-100 : ");
                guess = sc.nextInt();
                int diff = Math.abs(cmp - guess);
                if(guess == cmp){
                    break;
                }
                if (diff < 5){
                    System.out.println("You are very close to the answer. Try again!");
                }
                else if(diff > 5 && diff < 15){
                    System.out.println("you are a bit far from the answer. Try again!");
                }
                else if(diff > 15){
                    System.out.println("you are far from the answer. Try again!");
                }
               
                i++;
             }

             if(guess == cmp){
                System.out.println("Your guess "+ guess+" was correct. Conratulations");
             }
             else{
                System.out.println("You failed the Game! The correct guess is "+ cmp);
             }
        }
        if(mode == 2){
             int i = 0;
             while(i<11 ){
                System.out.print("Guess a number from 1 - 100: ");
                guess = sc.nextInt();
                if(guess == cmp){
                    break;
                }
                int diff = Math.abs(cmp - guess);
                if (diff < 5){
                    System.out.println("You are very close to the answer. Try again!");
                }
                else if(diff > 5 && diff < 15){
                    System.out.println("you are a bit far from the answer. Try again!");
                }
                else if(diff > 15){
                    System.out.println("you are far from the answer. Try again!");
                }
                i++;
             }
             if(guess == cmp){
                System.out.println("Your guess "+ guess+" was correct. Conratulations");
             }
             else{
                System.out.println("You failed the Game! The correct guess is "+ cmp);
             }
        }
    }
}
