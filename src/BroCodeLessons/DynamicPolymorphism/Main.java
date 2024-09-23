package BroCodeLessons.DynamicPolymorphism;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Animal animal;
        String choice;

        System.out.println("Type an animal:");
        choice = scanner.nextLine();

        if(choice.toLowerCase(Locale.ROOT).equals("dog")){
            animal = new Dog();
            animal.speak();
        }
        else if(choice.toLowerCase(Locale.ROOT).equals("cat")){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Idk that animal");
            animal = new Animal();
            animal.speak();
        }
    }
}
