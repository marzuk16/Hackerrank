import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                for (int j=s1.length();j<15;j++){
                    s1 += " ";
                }
                System.out.println(s1 + String.format("%03d", x));
            }
            System.out.println("================================");

    }
}