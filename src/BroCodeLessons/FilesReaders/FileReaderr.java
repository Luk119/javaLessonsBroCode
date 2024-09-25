package BroCodeLessons.FilesReaders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args){

        try{
            FileReader reader = new FileReader( "src" + File.separator + "BroCodeLessons" + File.separator +
                    "FilesReaders" + File.separator + "art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
