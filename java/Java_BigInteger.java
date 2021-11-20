import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(sum);
        System.out.println(mul);

        
    }
}
