//Number guessing Game
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    boolean won =false;
    int randomNumber= (int) (Math.random()*100)+1;
    System.out.println("We have randomly chosen number between 1 and 100");
    System.out.println("Try to guess it!");

    Scanner scanner= new Scanner(System.in);
    for(int i=10;i>0;i--){
      
      System.out.println("You have "+i+" guesses left. Choose again: ");
      int guess=scanner.nextInt();

      if(randomNumber<guess){
        System.out.println("It's smaller than "+guess+ ".");
      }
      else if(randomNumber>guess){
        System.out.println("It's greater than "+ guess+".");
      }

      else{
        won=true;
        break;
      }

      
    }

    if(won){
      System.out.println("WOW!! ..You WIN!!");
    }
    else{
      System.out.println("Game over...You LOSE!!");
      System.out.println("The number was: "+randomNumber);
    }
  }
}