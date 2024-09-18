package BroCodeLessons;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<>();

        food.clear();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot dog");

        food.set(0, "sushi");
        food.remove(1);
        System.out.println(food.indexOf("hot dog"));
        System.out.println(food.isEmpty());
        System.out.println(food.contains("hot dog"));

        System.out.println("\nEnhanced for loop");
        for (String s : food) {
            System.out.println(s);
        }

        System.out.println("\nIterator - while loop");

        Iterator<String> it = food.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
