package BroCodeLessons;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int col;
        String symbol = "";

        System.out.println("enter rows: ");
        rows = scanner.nextInt();
        System.out.println("enter columns: ");
        col = scanner.nextInt();
        System.out.println("enter symbol: ");
        symbol = scanner.next();


        for(int i=0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
