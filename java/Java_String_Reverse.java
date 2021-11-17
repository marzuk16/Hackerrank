import java.io.*;
import java.util.*;

public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int back = A.length() - 1;
        boolean flag = true;
        
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != A.charAt(back--)){
                System.out.println("No");
                flag = false;
                break;
            }
        }
        
        if(flag) System.out.println("Yes");
        
    }
}
