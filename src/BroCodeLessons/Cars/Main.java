package BroCodeLessons.Cars;

public class Main {
    public static void main(String[] args){

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.carBrand = "Kia";

        System.out.println(myCar.carBrand);
        System.out.println(yourCar.carBrand);
        System.out.println(myCar.price);
        myCar.drive();
        myCar.brake();
    }
}
