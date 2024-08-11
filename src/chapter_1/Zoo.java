package chapter_1;

public class Zoo {
    /**
     * javac -> convert java class to java bytecode (.class)
     * java -> execute the program
     * jar -> Packages files together
     * javadoc -> Generates documentation
     * Compile -> javac chapter_1.Zoo.java
     * Run -> java chapter_1.Zoo
     * Run -> java chapter_1.Zoo Bronx Zoo
     * Run -> java chapter_1.Zoo "San Diego" Zoo
     * The follow are valid declaration for an array.
     * String[] args
     * String options[]
     * String... friends
     *
     *(Single-file source)
     * We can us java Zoo.java Bronx Zoo instead of using javac to compile and java to execute the program
     * That works just when the program is one file.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("hi!!!");
//        System.out.println(args[0]);
//        System.out.println(args[1]);
    }
}

