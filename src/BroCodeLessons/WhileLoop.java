package BroCodeLessons;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        while(name.isBlank());

        System.out.println("Hi " + name);

        int i = 25;

        while(i > 0){
            System.out.println("Hi " + name);
            i--;
        }
    }
}
