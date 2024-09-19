package BroCodeLessons.StaticKeyword;

public class Friend {

    String name;
    static int numberOfFriends;// static keyword - total amount of friends that have been created

    Friend(String name){

        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.printf("You have %s friends", numberOfFriends);
    }
}
