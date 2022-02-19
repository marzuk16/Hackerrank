package DS;

public class DsExecutor {

    public static void main(String[] args) throws Exception{
        // Node<Integer> node = new Node<Integer>();
        // System.out.println(node);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(2);
        linkedList.insert(8);
        linkedList.insert(0);
        linkedList.insert(-2);
        linkedList.insert(21);
        linkedList.insertAtStart(1);
        linkedList.insert(11, 8);

        linkedList.show();
        System.out.println("Size: " + linkedList.size());
        linkedList.reverse();
        linkedList.show();
    }
}