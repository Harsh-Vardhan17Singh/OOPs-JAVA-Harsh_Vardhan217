import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args){
    try{
        File Obj = new File("HARSH.txt");

        if(Obj.createNewFile()){
            System.out.print("File Created:" +Obj.getName());
        }else{
            System.out.print("File Already Exists");
        }
    }
    catch(IOException e){
        System.out.print("An error has Occured");
        e.printStackTrace();
    }
}
    
}
