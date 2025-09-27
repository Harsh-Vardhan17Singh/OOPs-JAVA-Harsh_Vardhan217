import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first No :");
        int a = sc.nextInt();
        System.out.print("Enter first No :");
        int b = sc.nextInt();
        try{
            int c= a/b ;
            System.out.print("Result=" +c);

        }catch(ArithmeticException e){
            System.out.print("Division with Zero is not possible");
        }

        sc.close();


    }
    
}
