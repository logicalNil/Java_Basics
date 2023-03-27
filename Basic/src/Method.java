
class Calc{
    public int add(int n1, int n2 , int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}



public class Method {
    public static void main(String[] args) {

        int a = 6;
        int b = 4;
        {
            Calc obj = new Calc();
            int result = obj.add(a , 4 , 5);
            System.out.println(result);
            System.out.println(obj.add(a, 4));
            int result2 = obj.sub(a, 4);
            System.out.println(result2);
            int result3 = obj.mul(a, 4);
            System.out.println(result3);
            int result4 = obj.div(a, 4);
            System.out.println(result4);
        }
    }
}
