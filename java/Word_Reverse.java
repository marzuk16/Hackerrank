import java.util.Arrays;
import java.util.stream.Collectors;

public class Word_Reverse {
    public static void main(String[] args) {
        String text = "Stored procedure VS Fuction";
        
        System.out.println("TEXT: " + text.replace(" ", ","));

        String s = Arrays
                    .asList(text.split(" "))
                    .stream()
                    .map(i -> new StringBuilder(i).reverse())
                    .collect(Collectors.joining(" "));

        System.out.println(s);
    }
}