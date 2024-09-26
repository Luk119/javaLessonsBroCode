package BroCodeLessons.Generics;

public class Main2 {
    public static void main(String[] args){

        Integer[] intArray = {1, 2, 3, 4, 55};
        Double[] doubleArray = {3.13, 3.12312, 1.234, 10.2, 2.0};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        String[] stringArray = {"InteliJ", "Pycharm"};

//        dispLayArray(intArray);
//        dispLayArray(doubleArray);
//        dispLayArray(charArray);
//        dispLayArray(stringArray);

        System.out.println(intArray[0]);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    private static <Thing> void dispLayArray(Thing[] array){

        for(Thing t : array){
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
}
