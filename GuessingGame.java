package welcome.guessinggame;
import javax.swing.*;
 
public class GuessingGame {
    public static void main(String[] args) {
        int SecretNumber = (int) (Math.random()*100 + 1);
        System.out.println("The Sectret number is : " + SecretNumber);
        int GamerAnswer = 0;
        int count = 1;
  
        while (GamerAnswer != SecretNumber){
            String store = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Welcome to Guessing Game", 3);
            GamerAnswer = Integer.parseInt(store);
            JOptionPane.showMessageDialog(null, ""+ Guess(GamerAnswer, SecretNumber, count));
            count++;
        }  
    }

    public static String Guess(int GamerAnswer, int SecretNumber, int count){
        if (GamerAnswer <=0 || GamerAnswer >100) {
            return "Your guess is invalid, try again. ";
        }
        else if (GamerAnswer == SecretNumber && count ==1){
            return "Correct!!  You nailed it.You take only 1 guess";
        }
        else if (GamerAnswer == SecretNumber){
            return "Correct!!  Welldone\nTotal Guesses: " + count +"\n try to crack it in 1 guess";
        }
        else if (GamerAnswer > SecretNumber) {
            return "Your guess is high, try again.\nTry Number: " + count;
        }
        else if (GamerAnswer < SecretNumber) {
            return "Your guess is low, try again.\nTry Number: " + count;
        }
  
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}