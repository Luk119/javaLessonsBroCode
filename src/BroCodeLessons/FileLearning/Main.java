package BroCodeLessons.FileLearning;
import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args){

        String filePath = "src" + File.separator + "BroCodeLessons" + File.separator + "FileLearning" +
                File.separator + "text.txt";
//create file
        File file = new File(filePath);

        if(!file.exists()){
            try{
                file.createNewFile();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("File already exists");
        }
//write to file
        try{
            FileWriter writer = new FileWriter(filePath);
            writer.write("Java, HTML, Python, C++, Css, C#");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
//reading from file

        try{
            FileReader reader = new FileReader(filePath);

            int text = reader.read();

            while(text != -1){
                System.out.print((char) text);
                text = reader.read();
            }
            System.out.println();
            reader.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            if(Files.size(Path.of(filePath)) == 0) {
                System.out.println("file is empty");
            }
            else{
                System.out.println("File is not empty");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(file.getPath());
        System.out.println(file.exists());

    }
}
