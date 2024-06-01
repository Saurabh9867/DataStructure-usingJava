import BinaryTreeImpl.BinaryTree;
import LinkedListImpl.LinkedList;

public class mainMethod {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.show();

        list.insertAt(4,100);

        list.show();

        System.out.println(list.size());

        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.println(list1.size());
        list1.show();


        BinaryTree bt = new BinaryTree();
        bt.insert(12);
        bt.insert(5);
        bt.insert(4);
        bt.insert(50);
        bt.insert(23);
        bt.insert(65);

        bt.show();

    }
}
