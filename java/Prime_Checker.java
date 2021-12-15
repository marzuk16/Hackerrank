import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {
    public void checkPrime(int ...nums){
        List<Integer> primes = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int flag = 0;
            if(nums[i] == 2) {
                primes.add(nums[i]);
                continue;    
            }
            for(int j=2; j<= nums[i] / 2; j++){
                if(nums[i] % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0 && nums[i] != 1) primes.add(nums[i]);
        }
        if(primes.size() > 0){
            for(int i=0; i<primes.size(); i++){
                System.out.printf(primes.get(i) + " ");
            }
            System.out.println();
        }else {
            System.out.println();
        }
    }
}

public class Prime_Checker {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
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
			System.out.println(e);
		}
	}
	
}
