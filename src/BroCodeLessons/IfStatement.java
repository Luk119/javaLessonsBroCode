package BroCodeLessons;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int user_age;

        System.out.println("How old are u?");
        user_age = scanner.nextInt();

        if(user_age >= 70) {
            System.out.println("You're an old man, Sir.");
        }
        else if(user_age >= 18){
                System.out.println("You can drink beer ;)");
        }
        else{
            System.out.println("You are too young to drink");
        }

    }
}
