package BroCodeLessons;
import java.util.Random;

public class RandomValues {
    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt(100);
        double y = random.nextDouble(1);
        boolean z = random.nextBoolean();

        System.out.println("Random value(0-100) = " + x);
        System.out.println("Random value(0-1) = " + y);
        System.out.println("Random bool value = " + z);
    }
}
