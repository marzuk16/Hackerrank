package thread;

public class MultithreadingUsingLamdaExpression {
    
    public static void main(String[] args) {
        Runnable hi = /* new Runnable() {
            // anonymous class
            public void run */()->{
                for(int i=0; i<5; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500); 
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.err.println("Hi class error: " + e.getMessage());
                    }
                }
            };
        // };

        Runnable hello = /* new Runnable() {
            // anonymous class
            public void run */()->{
                for(int i=0; i<5; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500); 
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.err.println("Hello class error: " + e.getMessage());
                    }
                }
            };
        // };

        // Thread t1 = new Thread(hi);
        // Thread t2 = new Thread(hello);

        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(500); 
                } catch (Exception e) {
                    //TODO: handle exception
                    System.err.println("Hi class error: " + e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(()->{
                for(int i=0; i<5; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500); 
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.err.println("Hello class error: " + e.getMessage());
                    }
                }
            });

        t1.start();
        t2.start();
    }
}
