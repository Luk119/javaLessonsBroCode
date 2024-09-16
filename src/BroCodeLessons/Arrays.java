package BroCodeLessons;

public class Arrays {
    public static void main(String[] args){

        String[] car = new String[3];

        car[0] = "Honda";
        car[1] = "Kia";
        car[2] = "Jeep";

        for(int i = 0; i < car.length; i++){
            System.out.println("Car " + i + ". --- " + car[i]);
        }

        System.out.println("\n");

        String[] students = {"James", "John", "Sue", "Alex"};

        students[2] = "Monica";

        for(int j = 0; j < students.length; j++){
            System.out.println(students[j]);
        }
    }
}
