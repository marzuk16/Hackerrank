package thread;

// Runnable is a functional interface
class Hi implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500); 
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Hi class error: " + e.getMessage());
            }
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Hello class error: " + e.getMessage());
            }
        }
    }
}
public class ImplementsRunnableInterface {
    
    public void runner(){
        Hi hi = new Hi();
        Hello hello = new Hello();

        // hi.start(); // runnable does not provide any start method
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();
    }
}
