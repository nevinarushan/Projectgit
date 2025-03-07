import java.util.Scanner;
public class Postfixexpression {
    public  int[] stackArray;
    public int top;
    public int remove_value;

    public static void main(String[]args){
        Postfixexpression postfixexpression=new Postfixexpression();
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a post fix expression");
        System.out.println("Enter");
        String expression=input.next();

        String[] expressionArray=expression.split("");

        for (String element : expressionArray) {
            if (element.matches("\\d+")) { // Checks if the element is an integer
                 postfixexpression.insert(Integer.parseInt(element));
            }
            else if (element.matches("[+\\-*/]")) {

                int operand1=postfixexpression.remove();
                int operand2=postfixexpression.remove();
                int result=0;

                switch (element) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                }
                postfixexpression.insert(result);
            }
            else { // Anything else is considered as "others"
                break;
            }
        }

        System.out.println("Result: " + postfixexpression.remove());
    }
    public Postfixexpression(){
        stackArray=new int[100];
        top =-1;
    }
    public void insert(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }
        stackArray[++top]=value;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Stack is empty cant release more");
            return 0;
        }


        return stackArray[top--];
    }
    public boolean isFull(){
        return top==100;
    }
    public boolean isEmpty(){
        return top==-1;
    }

}
