package BroCodeLessons.Encapsulation;

public class Main {
    public static void main(String[] args){

        Car car = new Car("Honda", "Civic", 2022);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setBrand("Mazda");
        car.setModel("CX-5");
        car.setYear(2024);

        System.out.println("\n" + car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
