package BroCodeLessons.Generics;

public class Main {
    public static void main(String[] args){

        Integer[] intArray = {1, 2, 3, 4, 55};
        Double[] doubleArray = {3.13, 3.12312, 1.234, 10.2, 2.0};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        String[] stringArray = {"InteliJ"};

        dispLayArray(intArray);
        dispLayArray(doubleArray);
        dispLayArray(charArray);
        dispLayArray(stringArray);
    }


    private static void dispLayArray(Integer[] intArray) {

        for(Integer i : intArray){
            System.out.println(i + " ");
        }
    }

    private static void dispLayArray(Double[] doubleArray){
        for(Double d : doubleArray){
            System.out.println(d + " ");
        }
    }

    private static void dispLayArray(Character[] charArray){
        for(Character c : charArray){
            System.out.print(c + " ");
        }
    }

    private static void dispLayArray(String[] stringArray){
        for(String s : stringArray){
            System.out.print(s + " ");
        }
    }
}
