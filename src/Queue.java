public class Queue<T>{

    private int QUEUE_SIZE = 5;
    private Object[] arr;
    private int front;
    private int rear;

    Queue(){
        arr = new Object[5];
    }
    Queue(int QUEUE_SIZE){
        this.QUEUE_SIZE = QUEUE_SIZE;
        arr = new Object[QUEUE_SIZE];
    }

    public void enQueue(T data){
        if(!isFull()) {
            arr[rear] = data;
            rear++;
            return;
        }
        System.out.println("Queue is Full. Can't perform add operation");
    }

    public void deQueue(){
        if(!isEmpty()){
            shiftLeft();
            rear--;
            return;
        }
        System.out.println("Queue is Empty. Can't perform remove operation");
    }

    private void shiftLeft(){
        int pointer = front;
        while (pointer < rear - 1){
            arr[pointer] = arr[pointer+1];
            pointer++;
        }
        arr[pointer] = null;
    }

    public boolean isEmpty(){
        if(rear == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if(rear == QUEUE_SIZE)
            return true;
        return false;
    }

    @Override
    public String toString(){
        if(rear == 0)
            return "[]";
        for(Object data:arr){
            if(data != null)
                System.out.print(data + " ");
        }
        return "";
    }
}
