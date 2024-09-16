package BroCodeLessons;

public class LogicalOperators {
    public static void main(String[] args){
        // && (AND gate)
        // || (OR gate)
        // ! (NOT gate)
        int engineOil_temperature = 80;
        int transmissionOil_temperature = 76;
        boolean drivers_focus = true;

        String command;

        if(engineOil_temperature>=80 && transmissionOil_temperature>75 && drivers_focus==true){
            command = "car: ready\ndriver: ready";
        }
        else if(engineOil_temperature>=80 && transmissionOil_temperature>75 && drivers_focus!=true){
            command = "car: ready\ndriver: NOT ready";
        }
        else{
            command = "car: NOT ready\ndriver: NOT ready";
        }

        System.out.println("No. 19\n" + command);
        System.out.println("End");

    }
}
