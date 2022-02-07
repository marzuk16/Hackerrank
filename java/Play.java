import java.util.Arrays;
import java.util.stream.Collectors;

public class Play {
    public static void main(String[] args) {
        System.out.println("Main method executing........");
        recur(1, 10);
        System.out.println();
        System.out.println(rev("Md Marzukul Islam siddiki"));
    }

    public static int recur(int start, int end){
        if(start > end) return start;
        System.out.print(start + " ");

        recur(start + 1, end);
        System.out.print(start + " ");
        return 0;
    }

    public static String rev(String str){
        return Arrays.asList(str.split(" "))
        .stream()
        .map(i -> new StringBuffer(i).reverse())
        .filter(i -> i.length() > 5)
        .map(i -> new StringBuffer(i).replace(1, 2, "R"))
        .collect(Collectors.joining(","));
    } 
}