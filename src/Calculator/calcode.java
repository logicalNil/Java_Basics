package Calculator;

public class calcode {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a / b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        }
        return a / b;
    }
}
