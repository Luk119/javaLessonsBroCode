package BroCodeLessons.Generics.GenericClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(1.2);
        MyCharacterClass myChar = new MyCharacterClass('a');
        MyStringClass myString = new MyStringClass("ABC");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        MyGenericClass<Integer> myInt2 = new MyGenericClass<>(2);
        MyGenericClass<Double> myDouble2 = new MyGenericClass<>(2.2);
        MyGenericClass<Character> myChar2 = new MyGenericClass<>('b');
        MyGenericClass<String> myString2 = new MyGenericClass<>("CBA");

        ArrayList<String> myFriend = new ArrayList<>();

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
        System.out.println(myChar2.getValue());
        System.out.println(myString2.getValue());
    }
}