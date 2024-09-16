package BroCodeLessons;
import java.util.Scanner;

public class OrGate {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 'q' or 'Q' to quit");

        String userInput = scanner.next();

        if(userInput.equals("q") || userInput.equals("Q")){
            System.out.println("Thanks and goodbye.");
        }
        else{
            System.out.println("Let's play the game.");
        }
    }
}
