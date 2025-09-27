import java.io.*;
public class ExceptionHandling2 {
    public static void main  (String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(in);
        int a, b, c;
        System.out.print("Enter First No.:");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter Second Number:");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.print("Sum =" +c);

    }
    
}
