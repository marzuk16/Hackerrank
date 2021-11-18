import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String fst = a.toLowerCase();
        String snd = b.toLowerCase();
        
        int A[] = new int[26], B[] = new int[26];
        Boolean anagram = true;
        
        if(fst.length() == snd.length()){
            for(int i=0; i<fst.length(); i++){
                A[ (int)fst.charAt(i) - 97 ] ++;
                B[ (int)snd.charAt(i) - 97 ] ++;
            }
            
            for(int i=0; i<26; i++){
                if(A[i] != B[i]){
                    anagram = false;
                    break;
                }
            }
            
        }else anagram = false;
        
        return anagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
