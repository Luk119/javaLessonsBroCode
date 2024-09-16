package BroCodeLessons;
import javax.swing.*;

public class Gui {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You're " + age + " years old.");

        System.out.println("Thanks for coming " + name);
    }
}
