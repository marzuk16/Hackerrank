package thread;

class Hi extends Thread{
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
class Hello extends Thread{
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
public class ExtendsThreadClass {

    public void threadRunner(){

        Hi hi = new Hi();
        Hello hello = new Hello();
    
        hi.start();
        hello.start();
    }
    
}
