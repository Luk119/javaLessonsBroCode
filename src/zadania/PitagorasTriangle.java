package zadania;
import java.util.Scanner;

public class PitagorasTriangle {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter x: ");
        float x = scanner.nextFloat();

        System.out.print("Enter y: ");
        float y = scanner.nextFloat();

        float z = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.print("z: " + z);


    }
}
