package BroCodeLessons.Encapsulation;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car("Honda", "Civic", 2022);
        Car car2 = new Car("Kia", "Ceed", 2011);
        Car car3 = new Car(car2);

        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        car1.setBrand("Mazda");
        car1.setModel("CX-5");
        car1.setYear(2024);

//                Copying objects

        car2.copyV(car1);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("\n" + car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println("\n" + car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println("\n" + car3.getBrand());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
