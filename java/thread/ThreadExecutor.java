package thread;

public class ThreadExecutor {

    public static void main(String[] args) {

        // extends thread class
        ExtendsThreadClass c = new ExtendsThreadClass();
        c.threadRunner();

        //implements runnable class
        ImplementsRunnableInterface runnableInterface = new ImplementsRunnableInterface();
        runnableInterface.runner();
    }
}
