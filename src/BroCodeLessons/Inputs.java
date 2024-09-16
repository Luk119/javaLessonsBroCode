package BroCodeLessons;
import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.print("Wiek: " + wiek);
    }
}