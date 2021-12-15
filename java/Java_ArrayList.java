import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_ArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> table [] = new ArrayList[n];
        for(int i=0; i<n; i++){
            table[i] = new ArrayList();
            int d = in.nextInt();
            for(int j=0; j<d; j++){
                int x = in.nextInt();
                table[i].add(x);
            }
        }
        
        int q, x, y;
        q = in.nextInt();
        for(int i=1; i<=q; i++){
            x = in.nextInt();
            y = in.nextInt();
            
            if(x > n-1 || y > table[x-1].size()){
                System.out.println("ERROR!");
            }else{
                System.out.println(table[x-1].get(y-1));
            }
        }
    }
}

