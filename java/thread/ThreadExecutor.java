package thread;

public class ThreadExecutor {

    public static void main(String[] args) throws Exception {

        // extends thread class
        // ExtendsThreadClass c = new ExtendsThreadClass();
        // c.threadRunner();

        //implements runnable class
        // ImplementsRunnableInterface runnableInterface = new ImplementsRunnableInterface();
        // runnableInterface.runner();

        SynchronizedThread sThread = new SynchronizedThread();
        // sThread.increment();
        // sThread.increment();
        // System.out.println(sThread.count);

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=1000; i++){
                sThread.increment();
            }
        });

        t1.start();
        t1.join();
        System.out.println(sThread.count);
    }
}
