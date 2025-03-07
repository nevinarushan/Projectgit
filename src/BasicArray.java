
import java.util.*;
public class BasicArray {
    public int[] StackArray;
    public int top;
    public int capacity;

    public  BasicArray(int size){
        top=-1;
        capacity=size;
        StackArray=new int[capacity];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full");
        }
        StackArray[++top]=num;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return StackArray[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return StackArray[top];
    }

    public void display(){
        System.out.print("Elements in stack are: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(StackArray[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BasicArray class1=new BasicArray(3);
        Scanner src=new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        for(int i=0;i<class1.StackArray.length;++i){
            System.out.print("Enter number");
            int num=src.nextInt();
            class1.push(num);
        }
        System.out.println("Peek "+class1.peek());
        System.out.println("Popped "+class1.pop());
        class1.display();
        System.out.println("Is Stack empty "+class1.isEmpty());
        System.out.println("Is Stack Full "+class1.isFull());
    }
}
