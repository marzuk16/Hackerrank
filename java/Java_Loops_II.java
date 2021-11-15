import java.util.*;
import java.io.*;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int i=0; i<(n-1); i++){
                a += (1 << i) * b;
                System.out.printf("%d ", a);
            }
            a += (1 << n-1) * b;
            System.out.println(a);
        }
        in.close();
    }
}
