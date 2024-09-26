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

        MyGenericClass<Integer, Integer> myInt2 = new MyGenericClass<>(2, 3);
        MyGenericClass<Double, Double> myDouble2 = new MyGenericClass<>(2.2, 2.0);
//        MyGenericClass<Character, Character> myChar2 = new MyGenericClass<>('b', 'c');
//        MyGenericClass<String, String> myString2 = new MyGenericClass<>("CBA", "a123");

        ArrayList<String> myFriend = new ArrayList<>();

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
//        System.out.println(myChar2.getValue());
//        System.out.println(myString2.getValue());
    }
}