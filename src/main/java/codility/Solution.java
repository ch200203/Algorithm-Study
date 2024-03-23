package codility;

public class Solution {

    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(2);

        System.out.println(a1);
        System.out.println(a2);
    }

    static class A {
        private int a;

        public A(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
    }
}
