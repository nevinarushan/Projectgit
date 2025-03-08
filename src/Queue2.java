import java.util.*;
public class Queue2 {
    private int[]Queue;
    private int capacity;
    private int rear;
    private int front;
    private int no_item;

    public  Queue2(int size){
        capacity=size;
        Queue=new int[capacity];
        rear=-1;
        front=0;
    }

    public void insert(int num){
        if(isFull()){
            System.out.println("The Queue is full cant add numbers");
            return;
        }
        Queue[++rear]=num;
        ++no_item;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Nothing to remove idiot");

        }
        no_item--;
        return Queue[front++];

    }

    public boolean isFull(){
        return rear==capacity-1;
    }

    public boolean isEmpty(){
        return no_item==0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Nothing to peek idiot");

        }
        return Queue[front];
    }

    public void displayDetails(){
        System.out.println("The Queue is "+ Arrays.toString(Queue));
    }

    public static void main(String[] args) {
        Queue2 queue=new Queue2(4);
        queue.insert(30);
        queue.insert(10);
        queue.insert(20);
        queue.insert(40);
        queue.insert(50);
        queue.remove();
        queue.peek();
        queue.displayDetails();
    }
}
