package BroCodeLessons.Humans;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name_u, int age_u, double weight_u){
        name = name_u;
        age = age_u;
        weight = weight_u;
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight + "\n");
    }

    void eat(String food){
        if(food == "pizza"){
            weight += 1;
        }
        else if(food == "broccoli"){
            weight += 0.2;
        }
    }
}
