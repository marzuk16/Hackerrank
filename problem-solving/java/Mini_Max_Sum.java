import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
    for(int i=0; i<arr.size(); i++){
        Long m = 0l;
        for(int j=0; j<arr.size(); j++){
            if(i != j){
                m += arr.get(j);   
            }
        }
        if(m.compareTo(min) < 0) min = m;
        if(m.compareTo(max) > 0) max = m;
    }
    System.out.println(min + " " + max);

    }

}

public class Mini_Max_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}