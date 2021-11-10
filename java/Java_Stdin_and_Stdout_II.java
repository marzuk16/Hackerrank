import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        input.nextLine();
        String c = input.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
    
}
