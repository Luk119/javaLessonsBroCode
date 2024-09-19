package BroCodeLessons.OverloadedConstructors;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza2 = new Pizza("thin crust", "", "gouda");

        System.out.println("Here are ingredients of your pizza1: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println("Here are ingredients of your pizza2: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);

    }
}
