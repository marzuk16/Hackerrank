import java.util.HashMap;

interface InnerPlay {
    public void sum(int a, int b);
    public void mul(int a, int b);
}

class In implements InnerPlay {
    public void sum(int a, int b){
        System.out.println(a + b);
    }

    public void mul(int a, int b) {
        System.out.println(a*b);
    }
}
public class Play{
    public static void main(String[] args) {
       In in = new In();
       in.sum(1,2);
    }
}