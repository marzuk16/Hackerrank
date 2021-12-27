package interfaces;

public class InterfaceExecutor {
    public static void main(String[] args){
        InterfaceTest i = new InterfaceImplement();
        
        System.out.println(i.sum(2, 4));
        System.out.println(i.mul(2, 4));
    }
    
}
