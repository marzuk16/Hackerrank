import java.io.*;
import java.util.*;

public class Java_Exception_Handling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try{
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            
            System.out.println(num1 / num2);
        }catch (InputMismatchException i){
            System.out.println(i.getClass().getName());
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
