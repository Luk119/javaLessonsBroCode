package zadania;

public class Variables2 {
    public static void main(String[] args){

        String x = "water";
        String y = "syrop";
        String temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("SWAP");

        System.out.println("x: " + x);
        System.out.println("y: " + y);



    }
}
