import java.util.Scanner;

public class CharArray {
    public char[] StackArray;
    public int top;
    public int capacity;

    public  CharArray(int size){
        top=-1;
        capacity=size;
        StackArray=new char[capacity];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(char value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        StackArray[++top]=value;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return StackArray[top--];
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return StackArray[top];
    }



    public static void main(String[] args) {

        String str="Hello World";
        char[] charArray = str.toCharArray();
        int lenght=charArray.length;
        CharArray class1=new CharArray(lenght);
        for (int i=0;i<lenght;++i){
            class1.push(charArray[i]);
        }
        System.out.println("");
        for (int i=0;i<lenght;++i){
            System.out.print(class1.pop());
        }

    }
}
