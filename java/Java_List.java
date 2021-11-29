import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        
        Integer n,l, query;
        
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            l = input.nextInt();
            ls.add(l);    
        }
        
        query = input.nextInt();
        String op;
        
        for(int i=1; i<=query; i++){
            op = input.next();
            if(op.equals("Insert")){
                n = input.nextInt();
                l = input.nextInt();
                
                ls.add(n, l);
            }else{
                n = input.nextInt();
                ls.remove((int)n);
            }
        }
        
        for(Integer i:ls){
                System.out.print(i + " ");
        }
    }
}
