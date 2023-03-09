import java.util.Scanner;

public class AutomobileCompany {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int w = input.nextInt();
        double res = ((4*v)-w)/2;
        if (w<2*v || w%2!=0 || res%1!=0){
            System.out.println("No Solution");
        }else{
            System.out.println((int)res);
            System.out.println(v-(int)res);
        }
    }
}
