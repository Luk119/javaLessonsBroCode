package BroCodeLessons.Serialization;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        User user = new User();

        user.name = "Łukasz";
        user.password = "qwerty123";

        try{

            FileOutputStream fileOut = new FileOutputStream("src" + File.separator + "BroCodeLessons" + File.separator +
                    "Serialization" + File.separator + "UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            System.out.println("Object info saved!");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

//        System.out.println(user.name);
//        System.out.println(user.password);
//        user.sayHello();

        long serialVersioNUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersioNUID);
    }
}
