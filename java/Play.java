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

class test{
    private int a;
    private String name;

    test(){

    }
    test(int a, String name){
        this.a = a;
        this.name = name;
    }

    public void run(){
        System.out.println("parent call");
    }
}

class test1 extends test{
    private int a1;
    private String name1;

    test1(int a, String name){
        this.a1 = a;
        this.name1 = name;
    }

    public void r(){
        System.out.println("test1");
    }
}
public class Play{
    public static void main(String[] args) {
        System.out.println("Play executing..........");

        test t = new test1(1, "name");
        // t.r();
        t.run();

    }
}