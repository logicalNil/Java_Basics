
/* Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.
If we overload the method, it is known as Method Overloading.
In other words, you can have more than one method with the same name in one class, if their argument lists are different.
Method Overloading is also known as Compile Time Polymorphism.*/


public class MethodOverloading {
}
/* This is also a comment/* More comments */

import java.util.Arrays;

public class HowWillYouCompare {
    private static class Comparator {
        public boolean compare(int a, int b) {
            return a == b;
        }

        public boolean compare(String a, String b) {
            return a.equals(b);
        }

        public boolean compare(int[] a, int[] b) {
            return Arrays.equals(a, b);
        }
    }

    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        System.out.println(comparator.compare(1, 1));
        System.out.println(comparator.compare("a", "a"));
        System.out.println(comparator.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }
}
