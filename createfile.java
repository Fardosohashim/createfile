package createfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try{
            File file=new File("File Name.txt");

            boolean value = file.createNewFile();

            if(value){
                System.out.println("create a new class:");
            }else{
                System.out.println("the file already exists");
            }
            FileWriter MyWriting=new FileWriter("My File Writer.txt");
            MyWriting.write("java program is fun! ");
            MyWriting.close();
            System.out.println("successfully done!! ");
        }catch(IOException e){
            System.out.println("error occurs");
            e.printStackTrace();
        }
    }
}
