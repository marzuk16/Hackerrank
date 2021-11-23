import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Add {
    public void add(int ...n){

        if(n.length == 2){
            int two = n[0] + n[1];
            System.out.println(n[0] + "+" + n[1] + "=" + two);
        }
        if(n.length == 3){
            int three = n[0] + n[1] + n[2];
            System.out.println(n[0] + "+" + n[1] + "+" + n[2] + "=" + three);
        }
        if(n.length == 5){
            int five = n[0] + n[1] + n[2] + n[3] + n[4];
            System.out.println(n[0] + "+" + n[1] + "+" + n[2] + "+" + n[3] + "+" + n[4] + "=" + five);
        }
        if(n.length == 6){
            int six = n[0] + n[1] + n[2] + n[3] + n[4] + n[5];
            System.out.println(n[0] + "+" + n[1] + "+" + n[2] + "+" + n[3] + "+" + n[4] + "+" + n[5] + "=" + six);
    }}
}

public class Java_Varargs_simple_addition {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}
