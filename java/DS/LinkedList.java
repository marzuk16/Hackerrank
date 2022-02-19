package DS;

class Node<T>{
    private T data;
    private Node<T> nextNode;

    @Override
    public String toString() {
        return "Data: " + this.data + " nextNode: " + this.nextNode;
    }

    public T getData() {
        return this.data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }
    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }
}
public class LinkedList <T>{

    Node<T> head;

    public Boolean insert(T data){
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        // System.out.println(newNode);
        if(head == null) head = newNode;
        else{
            Node<T> tempNode = head;
            while(tempNode.getNextNode() != null){
                tempNode = tempNode.getNextNode();
            }
            tempNode.setNextNode(newNode);
        }
        return true;
    }

    public Boolean insertAtStart(T data){
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        // System.out.println(newNode);

        newNode.setNextNode(head); 
        head = newNode;

        return true;
    }

    public Boolean insert(T data, int position){
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        // System.out.println(newNode);
       if(position < 0) return false;
       else if(position == 0) insertAtStart(data);
       Node<T> tempNode = head;
        while(position-- > 1){
            if(position > 0 && tempNode.getNextNode() == null) return false;
            tempNode = tempNode.getNextNode();
        }
        newNode.setNextNode(tempNode.getNextNode());
        tempNode.setNextNode(newNode);
        return true;
    }

    public void show() {
        Node<T> node = head;
        while (node.getNextNode() != null) {
            System.out.println(node.getData());
            node = node.getNextNode();
        }
        System.out.println(node.getData());
    }

    public Long size() {
        Long length = 0l;
        Node<T> node = head;
        while (node != null) {
            length++;
            node = node.getNextNode();
        }

        return length;
    }

    public Node<T> reverseImpl(Node<T> head){
        // if(head == null) return head;
        if(head.getNextNode() == null) return head;
        Node <T> tempNode = reverseImpl(head.getNextNode());
        head.setNextNode(head);
        // head.setNextNode(null);
        return tempNode;
    }

    public void reverse(){
        reverseImpl(head);
    }
}