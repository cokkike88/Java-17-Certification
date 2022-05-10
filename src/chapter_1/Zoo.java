package chapter_1;

public class Zoo {
    /**
     * Compile -> javac chapter_1.Zoo.java
     * Run -> java chapter_1.Zoo
     * Run -> java chapter_1.Zoo Bronx Zoo
     * Run -> java chapter_1.Zoo "San Diego" Zoo
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

