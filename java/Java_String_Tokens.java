import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() > 0 && s.length() < 400005){
            
            String tokens[] = s.trim().split("[^a-zA-Z]+");
            System.out.println(tokens.length);
            for(int i=0; i<tokens.length; i++){
                System.out.println(tokens[i]);
            }
        }else {
            System.out.println(0);
        }
        scan.close();
    }
}

