import java.util.Scanner;

public class Java_End_of_file {
    public static void main(){
        Scanner input = new Scanner(System.in);

        int i=0;
        while(input.hasNext() == true){
            String line = input.nextLine();
            System.out.println(++i + " " + line);
        }
    }
}
