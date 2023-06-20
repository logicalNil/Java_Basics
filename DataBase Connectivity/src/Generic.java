public class Generic<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        Generic<Integer> integerBox = new Generic<Integer>();
        Generic<String> stringBox = new Generic<String>();

        integerBox.set(new Integer(10));
        stringBox.set(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }

}
