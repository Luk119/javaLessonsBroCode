package BroCodeLessons.SuperKeyword;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("PeterParker", 42, "SpiderMan");
        Hero hero2 = new Hero("Superman", 33, "flying");
        Person person1 = new Person("John", 23);

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println("\n");
        System.out.println(hero2.toString());
    }
}
