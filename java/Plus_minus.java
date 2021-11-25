import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int pos = 0, neg = 0, zero = 0;
        for(int n : arr){
            if(n == 0) zero ++;
            if(n > 0) pos ++;
            if(n < 0) neg ++;
        }
        
        System.out.printf("%.6f\n", (pos*1.0) / arr.size());
        System.out.printf("%.6f\n", (neg*1.0) / arr.size());
        System.out.printf("%.6f\n", (zero*1.0) / arr.size());
    }

}

public class Plus_minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
