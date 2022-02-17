package interfaces;

public interface InterfaceTest {

    default void say(){
        saySomething();
    }

    int sum(int a, int b);
    int mul(int a, int b);

    private void saySomething(){
        System.out.println("Private method in interface");
    }
}
