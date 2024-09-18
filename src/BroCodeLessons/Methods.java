package BroCodeLessons;

public class Methods {
    public static void main(String[] args){

        String name = "Luke";
        int age = 21;
        hello(name, age);

        System.out.println("Pitagoras method: " + pitagorasTriangle(3,4));
    }

    static void hello(String nameUser, int ageUser){
        System.out.println("hello" + nameUser + "\nYou're " + ageUser + " years old.");
    }

    static double pitagorasTriangle(double x, double y){
        if(x <= 0 || y <= 0){
            System.out.println("Wrong input");
            return 0;
        }
        else{
            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
    }

}
