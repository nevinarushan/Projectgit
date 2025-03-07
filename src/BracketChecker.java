public class BracketChecker {

    // Custom stack implementation
    static class CustomStack {
        private char[] stackArray;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public CustomStack(int size) {
            stackArray = new char[size];
            capacity = size;
            top = -1;
        }

        // Push an element onto the stack
        public void push(char value) {
            if (isFull()) {
                throw new RuntimeException("Stack Overflow: Cannot push more elements");
            }
            stackArray[++top] = value;
        }

        // Pop an element from the stack
        public char pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack Underflow: Cannot pop from an empty stack");
            }
            return stackArray[top--];
        }

        // Peek at the top element of the stack without removing it
        public char peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stackArray[top];
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    // Method to check if the brackets are balanced
    public static boolean isBalanced(String expression) {
        CustomStack stack = new CustomStack(expression.length()); // Create a stack of appropriate size

        // Loop through each character in the expression
        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket, check for matching opening bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if a pair of brackets matches
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "({[]})",   // Balanced
                "{[()]}",   // Balanced
                "{[(])}",   // Not balanced
                "((()))",   // Balanced
                "(()",      // Not balanced
                "[{}])"     // Not balanced
        };

        // Check each test case
        for (String expression : testCases) {
            System.out.println("Expression: " + expression + " -> " +
                    (isBalanced(expression) ? "Balanced" : "Not Balanced"));
        }
    }
}

