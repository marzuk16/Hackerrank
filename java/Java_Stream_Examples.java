import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

class StreamTest{
    public static void tests(){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ls
        .stream()
        .filter(i -> i%2 == 0)
        .map(i -> i*2)
        .forEach(System.out::print);

        System.out.println(ls.stream().reduce(6, (c , e)-> c+e));

        String s = "Ethics Advance Technology Limited";
        s.chars().forEach(System.out::println);
        System.out.println();
        Arrays.asList(s.split(" "))
        .stream()
        .filter(i -> i.length() > 5)
        // .collect(Collectors.joining(","))
        .forEach(System.out::println);

        Stream ss = ls.stream();
        long cnt = Arrays.asList(s.split(" "))
        .stream()
        .filter(i -> i.length() > 5)
        .count();
        System.out.println("count: " + cnt);

        String last = ls.stream()
            .map(i -> i + "")
            .filter(i -> i.startsWith("1"))
            .reduce((a,b)->b)
            .get();

        System.out.println(last);

        ls.stream().limit(3).skip(2).forEach(System.out::println);

        System.out.println(
            ls.stream().limit(3).skip(2).reduce(0, (e,c) -> e+c)
        );
    }
}

public class Java_Stream_Examples{
    public static void main(String[] args) {
        StreamTest.tests();
    }
}