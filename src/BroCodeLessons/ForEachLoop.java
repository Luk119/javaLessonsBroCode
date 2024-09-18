package BroCodeLessons;
import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){

        System.out.println("Array: ");
        String[] animals = {"rat", "dog", "cat", "crocodile"};

        for(String s : animals){
            System.out.println(s);
        }

        System.out.println("\nArrayList:");

        ArrayList<String> animalArray = new ArrayList<>();
        animalArray.add("dog");
        animalArray.add("panda");
        animalArray.add("cow");
        animalArray.add("horse");

        for(String s : animalArray){
            System.out.println(s);
        }



    }
}
