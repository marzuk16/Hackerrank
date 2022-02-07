package thread;

public class MultithreadingUsingLamdaExpression {
    
    public static void main(String[] args) throws Exception {
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
        
        // threads name
        t1.setName("t1-thread"); // set threads name
        System.out.println("Thread name: " + t1.getName()); // returns threads name

        //threads priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());

        System.out.println(t1.isAlive());
        t1.join(); // wait parent thread untill t1 thread complete his job
        t2.join(); // wait parent thread untill t2 thread complete his job

        System.out.println("Bye");
        System.out.println(t1.isAlive());
        
    }
}
