package BroCodeLessons.Deserializer;
import BroCodeLessons.Serialization.User;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        User user = null;
        String filePath = "C:\\Users\\Łukasz\\IntelliJ\\untitled\\src\\BroCodeLessons\\Serialization\\UserInfo.ser";

        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
