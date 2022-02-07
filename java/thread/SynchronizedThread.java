package thread;

public class SynchronizedThread {
   public int count;

   public synchronized void increment(){ // only one thread can use this method at a time
       count++;
   }
}
