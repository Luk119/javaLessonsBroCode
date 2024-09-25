package BroCodeLessons.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        try{
            FileWriter writer = new FileWriter( "src" + File.separator + "BroCodeLessons" + File.separator +
                    "FileReader" + File.separator + "poem.txt");

            writer.write("Roses are red\nViolets are blue");
            writer.write("\n(A poem by B)");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
