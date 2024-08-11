package chapter_2;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = a++;
        int d = ++b;
        System.out.println(c);
        System.out.println(d);

        int value = 3;
        int complement = ~value;
        System.out.println(complement);
        System.out.println(-1*value -1);
    }
}
