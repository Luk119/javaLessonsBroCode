package BroCodeLessons.Inheritance;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car();

        Bicycle bicycle = new Bicycle();

//        car1.go();
//        bicycle.go();

        System.out.println("speed(car): " + car1.speed);
        System.out.println("speed(bicycle): " + bicycle.speed);
        System.out.println("doors(car): " + car1.doors);
        System.out.println("engine(car): " + car2.engine);
        System.out.println("engine(bicycle): " + bicycle.engine);

    }
}
