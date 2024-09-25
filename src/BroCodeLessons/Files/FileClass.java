package BroCodeLessons.Files;
import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args){

        File file = new File("src" + File.separator + "BroCodeLessons" + File.separator + "Files" + File.separator + "text_file.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isFile());
//        file.delete();




    }
}
