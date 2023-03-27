class Calculator{
     public int add(int n1, int n2){

         int r = n1+n2;
         return r;
    }
}

public class ClassObject {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        Calculator calc = new Calculator();

        int result = calc.add(a, b);
        System.out.println(result);
    }



}
