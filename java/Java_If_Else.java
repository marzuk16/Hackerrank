import java.util.Scanner;

public class Java_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if( (n%2) == 1 || (n >5 && n <21)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
    
}
