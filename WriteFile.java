import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("HARSH.txt");

            Writer.write("Files in Java are Seriously good");
            Writer.close();

            System.out.print("Successfilly Written.");

        }catch(IOException e){
            System.out.print("An error has Occurred");
            e.printStackTrace();

        }
    }
    
}
