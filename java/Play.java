import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.LinkedHashSet;

class st {

    public static Integer age;
    public static String name;    
}
public class Play{
    public static void main(String[] args) {
    
       st s = new st();
       s.age = 10;
       s.name = "Ten";
       st s1 = new st();

       s1.age = 12;
       s1.name = "Twelve";

       System.out.println(s.age + " " + s.name);
    }
}