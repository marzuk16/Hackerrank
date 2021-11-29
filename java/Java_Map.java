import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String name;
        Integer phone;

        Map<String, Integer> mp = new HashMap<>();

        n = in.nextInt();
        in.nextLine();
        
        for(int i=1; i<=n; i++){
            name = in.nextLine();
            phone = in.nextInt();
            in.nextLine();
            mp.put(name, phone);
        }

        while(in.hasNext()){
            name = in.nextLine();
            if(mp.containsKey(name)){
                System.out.println(name + "=" + mp.get(name));
            }else{
                System.out.println("Not found");
            }
        }
    }
    
}
