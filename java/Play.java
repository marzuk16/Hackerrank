import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Play {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        ls
        .stream()
        .filter(i -> i%2 == 0)
        .map(i -> i*2)
        .forEach(System.out::print);

        System.out.println(ls.stream().reduce(6, (c , e)-> c+e));

        String s = "Ethics Advance Technology Limited";
        System.out.println();
        Arrays.asList(s.split(""))
        .stream()
        .filter(i -> i.contains("e"))
        .forEach(System.out::println);

        Stream ss = ls.stream();
        System.out.println(ss);
    }
}