package BroCodeLessons;

public class SwitchCase {
    public static void main(String[] args){

        String username = "Boomboom";

        switch(username){
            case "SebiXD":
                System.out.println("You're genius Rocket League player.");
                break;
            case "Ofek":
                System.out.println("You're great Rocket League player.");
                break;
            case "Dzik":
                System.out.println("You're bad Rocket League player.");
                break;
            default:
                System.out.println("There is no such user as '" + username + "'");

        }
    }
}
