package BroCodeLessons.Humans;

public class Main {
    public static void main(String[] args){

        Human human1 = new Human("Łukasz", 21, 69.5);
        Human human2 = new Human("Dawid", 21, 78);
        Human human3 = new Human("Seba", 21, 55);

        human1.printInfo();
        human2.printInfo();
        human3.printInfo();

        human1.eat("broccoli");
        human2.eat("pizza");

        System.out.println(human1.weight);
        System.out.println(human2.weight);
    }
}
