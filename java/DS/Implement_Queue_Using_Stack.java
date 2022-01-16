package DS;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class CustomQueue<T>{
    protected Stack<T> s1 = new Stack<>();
    protected Stack<T> s2 = new Stack<>();

    public void push(T num){
        s1.push(num);
    }

    public T pop() {
        while(!s1.empty()){
            s2.push(s1.peek());
            s1.pop();
        }

        return s2.peek();
    }
}

public class Implement_Queue_Using_Stack{
    static void pQueue(){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>(4, (a,b) -> a > b ? -1 : 1);
        q.add(2);
        q.add(6);
        q.add(7);
        q.add(3);
        q.add(8);
        q.add(9);
        q.add(4);
        q.add(5);

        System.out.println(".....................");
        // q.forEach(item -> System.out.println(item));
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println(".....................");
        // System.out.println(q.size());
    }
    public static void main(String[] args){

        CustomQueue<Integer> q = new CustomQueue<>();
        CustomQueue<String> qs = new CustomQueue<>();
        q.push(2);
        q.push(3);
        q.push(4);
        qs.push("Marzuk");
        qs.push("Islam");
        qs.push("Siddiki");

        // System.out.println("Integer: " + q.pop());
        // System.out.println("String: " + qs.pop());

        pQueue();
    }
    
}