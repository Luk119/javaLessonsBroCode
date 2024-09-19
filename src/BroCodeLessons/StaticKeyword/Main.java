package BroCodeLessons.StaticKeyword;

public class Main {
    public static void main(String[] args){

        Friend friend1 = new Friend("Bula");
        Friend friend2 = new Friend("Ofek");
        Friend friend3 = new Friend("Sebek");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
