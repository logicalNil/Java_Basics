import java.util.Scanner;

// Create the interface stackoperation with method declarations for push and pop
interface StackOperation {
    void push(int element) throws StackOverflowException;
    int pop() throws StackUnderflowException;
}

// Create custom exception classes for stack overflow and stack underflow
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

// Create the class AStack which implements the interface and provides implementation for the methods
class AStack implements StackOperation {
    private int[] stack;
    private int top;
    private int capacity;

    public AStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Implement the push method
    public void push(int element) throws StackOverflowException {
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack Overflow");
        }
        stack[++top] = element;
        System.out.println("Element " + element + " pushed to the stack");
    }

    // Implement the pop method
    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack Underflow");
        }
        int poppedElement = stack[top--];
        return poppedElement;
    }

    // Method to display the values stored in the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

// Create the class InterfaceStackOp to test the stack operations
public class InterfaceStackOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        AStack stack = new AStack(size);

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                        break;
                    case 2:
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                        break;
                    case 3:
                        stack.display();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (StackOverflowException | StackUnderflowException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
