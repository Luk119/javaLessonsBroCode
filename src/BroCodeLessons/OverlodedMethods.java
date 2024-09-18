package BroCodeLessons;

public class OverlodedMethods {
    public static void main(String[] args) {

        System.out.println("result: " + mul(1, 2));
        System.out.println("result: " + mul(1, 2, 3));
        System.out.println("result: " + mul(1, 2, 3, 4));
        System.out.println(mul(2.5, 3.2));


    }

    static int mul(int a, int b){
        System.out.println("That was overloaded method No 1");
        return a*b;
    }
    static int mul(int a, int b, int c){
        System.out.println("That was overloaded method No 2");
        return a*b*c;
    }
    static int mul(int a, int b, int c, int d){
        System.out.println("That was overloaded method No 3");
        return a*b*c*d;
    }
    static double mul(double x, double y) {
        System.out.println("That was overloaded method No 4");
        return x * y;
    }
}
