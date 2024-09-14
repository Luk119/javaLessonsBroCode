package zadania;
import java.util.Scanner;


public class UserInputs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();

        System.out.print("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hi " + name + ", you're " + age + " years old. You like " + food);
    }
}
