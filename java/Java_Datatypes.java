import java.util.*;

public class Java_Datatypes {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int test  = input.nextInt();

        for(int i=1; i<=test; i++){
            
            try {

                long num = input.nextLong();
                
                System.out.println(num + " can be fitted in:");
                // if(num <= (1l << 7) - 1 && num >= -(1l << 7) - 1)
                //     System.out.println("* byte\n* short\n* int\n* long");
                // else if(num <= (1l << 15) - 1 && num >= -(1l << 15) - 1)
                //     System.out.println("* short\n* int\n* long");
                // else if(num <= (1l << 31) - 1 && num >= -(1l << 31) - 1)
                //     System.out.println("* int\n* long");
                // else if(num <= (long)((1l << 63) - 1) && num >= -(long)((1l << 63) - 1))
                //     System.out.println("* long");

                if(num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
                    System.out.println("* byte");
                if(num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
                    System.out.println("* short");
                if(num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
                    System.out.println("* int");
                if(num <= Long.MAX_VALUE && num >= Long.MIN_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }
    }
}
