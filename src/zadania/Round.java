package zadania;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Round {
    public static void main(String[] args) {
        double x = 1.5;
        double y = 2;
        double z = y / x;
        double round_z = Math.round(z);

        System.out.println("z= " + z);
        System.out.println("round_z= " + round_z);
        System.out.println("do 3-go miejsca po przecinku = " + Math.round(z * 1000.0) / 1000.0);

        BigDecimal rounded_number = new BigDecimal(z).setScale(6, RoundingMode.HALF_UP);

        System.out.println("rounded number HALF_DOWN: " + rounded_number);

        DecimalFormat decimalFormat = new DecimalFormat(".####");
        System.out.println("decimalFormat.format(z): " + decimalFormat.format(z));

        String formattedNumber = String.format("%.2f", z);
        System.out.println(formattedNumber);

        //ZAOKRĄGLANIE

        System.out.println("z w górę: " + Math.ceil(z));
        System.out.println("z w dół: " + Math.floor(z));
        System.out.println("z round: " + Math.round(z));

        double a = 0.1;
        double b = 0.2;

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");

        System.out.println(a + b);
        System.out.println(c.add(d));
    }
}