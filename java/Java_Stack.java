import java.util.*;
class Java_Stack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            int fst = 0, snd = 0, trd = 0;
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) == '(') fst ++;
                if(input.charAt(i) == ')') fst --;
                if(input.charAt(i) == '{') snd ++;
                if(input.charAt(i) == '}') snd --;
                if(input.charAt(i) == '[') trd ++;
                if(input.charAt(i) == ']') trd --;
                if(fst < 0 || snd < 0 || trd < 0) break;
            }
            
            if(fst == 0 && snd == 0 && trd == 0){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            
		}
		
	}
}
