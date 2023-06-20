import java.util.*;
public class Collections {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String input;

        System.out.println("Enter 'push' to push an element into the stack.");
        System.out.println("Enter 'pop' to pop an element from the stack.");
        System.out.println("Enter 'exit' to exit the program.");

        while(true) {
            System.out.print("Enter your choice: ");
            input = new Scanner(System.in).nextLine();
            if(input.equals("push")) {
                System.out.print("Enter the element to be pushed: ");
                input = new Scanner(System.in).nextLine();
                stack.push(input);
            }
            else if(input.equals("pop")) {
                if(stack.isEmpty()) {
                    System.out.println("Stack is empty.");
                }
                else {
                    System.out.println("Popped element: " + stack.pop());
                }
            }
            else if(input.equals("exit")) {
                break;
            }
            else {
                System.out.println("Invalid input.");
            }
            // Display the stack
            System.out.println("Stack: " + stack);
        }
    }
}
