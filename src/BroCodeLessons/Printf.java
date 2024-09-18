package BroCodeLessons;

public class Printf {
    public static void main(String[] args){

        System.out.printf("%f This is a format string %d %c\n\n", 1.234, 123, 'c');

        boolean myBoolean = true;
        char myChar = 'l';
        String myString = "Luke";
        int myInt = 23000000;
        double myDouble = 123.123;

        System.out.printf("%b\n%c\n%10.2s\n%,d\n%.2f", myBoolean, myChar, myString, myInt, myDouble);

    }
}
