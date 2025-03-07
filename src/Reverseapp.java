import java.util.Scanner;
public class Reverseapp{

    private char[] stackArray;
    private int top;
    private int capacity;


    public Reverseapp(int size){
        stackArray =new char[size];
        capacity=size;
        top = -1;
    }

    public char POP(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return '0';
        }
        return stackArray[top--];
    }

    public void  PUSH(char[] Array1){
        for(int i=0;i<Array1.length;++i) {
            if (isFull()) {
                System.out.println("The stack is full");
                return;
            }
            System.out.println("Value is added");
            stackArray[++top] = Array1[i];
        }
    }



    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public static void main(String[] args){
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        word=input.next();

        char[] Array1=word.toCharArray();

        Reverseapp stack = new Reverseapp(5);

        stack.PUSH(Array1);

        
        while(!stack.isEmpty()) {
            char poppedChar=stack.POP();
            if (poppedChar != '\0') {
                System.out.println("Popped character: " + poppedChar);
            }
        }
    }

}
