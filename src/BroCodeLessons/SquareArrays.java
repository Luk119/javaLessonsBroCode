package BroCodeLessons;

public class SquareArrays {
    public static void main(String[]args){

        String[][] cars = {
                {"Honda", "Civic", "1.8-gas", "2009"},//Company, Model, Engine
                {"Mercedes", "A class", "2.0-diesel", "2023"},
                {"Ferrari", "Testarossa", "5.0-gas", "1987"}
        };

        for(int i=0; i<cars.length; i++){
            System.out.println("car " + (i+1));
            for(int j=0; j<cars.length; j++){
                System.out.println(cars[i][j]);
            }
            System.out.println();
        }

    }
}
