package BroCodeLessons;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj x: ");
        float x = scanner.nextFloat();

        System.out.print("Podaj y: ");
        int y = scanner.nextInt();

        float suma = x + y;
        float d = 3.2f;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x + y = " + suma);
        System.out.println("x + y = " + (x+y));
        System.out.println(d);
    }
}