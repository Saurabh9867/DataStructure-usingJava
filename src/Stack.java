import java.util.EmptyStackException;

public class Stack<T>{

    private int STACK_SIZE = 5;
    private Object[] arr;
    private int top = -1;

    Stack(){
        arr = new Object[STACK_SIZE];
    }

    Stack(int STACK_SIZE){
        this.STACK_SIZE = STACK_SIZE;
        arr = new Object[STACK_SIZE];
    }

    public T push(T data){
        if(!isFull()){
            top++;
            arr[top] = data;
            return data;
        }
        System.out.println("Stack is full. Can't perform Push operation");
        throw new StackOverflowError();
    }

    public Object pop(){
        if(!isEmpty()){
            Object tempData = arr[top];
            arr[top] = null;
            top--;
            return tempData;
        }
        System.out.println("Stack is Empty. Can't perform Pop operation");
        throw new EmptyStackException();
    }

    public Object peek(){
        if(!isEmpty()){
            return arr[top];
        }
        System.out.println("Stack is Empty. Can't perform Pop operation");
        throw new EmptyStackException();
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(top == STACK_SIZE - 1)
            return true;
        return false;
    }

    @Override
    public String toString(){
        if(top == -1)
            return "[]";
        for(Object data:arr){
            if(data!=null)
                System.out.print(data + " ");
        }
        return "";
    }
}
