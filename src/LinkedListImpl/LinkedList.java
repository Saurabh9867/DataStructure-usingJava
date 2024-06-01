package LinkedListImpl;

public class LinkedList<T> {

    private Node<T> head;

    private Node<T> createNode(T data){
        return new Node<T>(data);
    }

    private Node getLastNode(){
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    private Node getNodeAt(int index){
        int count = 0;
        Node temp = head;
        while (count != index-1){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public void insert(T data){
        Node<T> node = createNode(data);
        if(head == null) {
            insertAtStart(node);
            return;
        }
        getLastNode().next = node;
    }

    public void insertAt(int index, T data){
        if (index == 0){
            insertAtStartIfAtLeastOneNode(data);
            return;
        }
        if(index > size()){
            System.out.println("Insert Operation can't be performed. Index " + index + " do not exist.");
            System.out.println("Please enter valid index which is within size.");
            return;
        }
        Node<T> node = createNode(data);
        node.next = getNodeAt(index).next;
        getNodeAt(index).next = node;
    }

    private void insertAtStart(Node<T> node){
        head = node;
    }

    private void insertAtStartIfAtLeastOneNode(T data){
        Node<T> node = createNode(data);
        node.next = head;
        head = node;
    }

    public int size(){
        if(head == null){
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp.next!=null){
            temp = temp.next;
            count++;
        }
        return ++count;
    }

    public void remove(int index){
        if (index == 0){
            head = head.next;
            return;
        }
        if(index > size()){
            System.out.println("Remove Operation can't be performed. Index " + index + " do not exist.");
            System.out.println("Please enter valid index which is within size.");
            return;
        }
        getNodeAt(index).next = getNodeAt(index).next.next;
    }

    public void show(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node travers = head;
        while (travers.next != null){
            System.out.print(travers.data + " ");
            travers = travers.next;
        }
        System.out.println(travers.data + " ");
    }

    private void test(T data, Node node){
        if(data != node.data){

        }
    }
}
