package BroCodeLessons.Polymorphism;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle v : racers){
            v.go();
        }
    }


}
