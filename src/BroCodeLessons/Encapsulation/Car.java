package BroCodeLessons.Encapsulation;

public class Car {

    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    Car(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.brand = car.brand;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.year = car.year;

    }

    public void copyV(Car car){
        this.setBrand(car.getBrand());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
