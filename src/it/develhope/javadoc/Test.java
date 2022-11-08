package it.develhope.javadoc;

/**
 * @author Mauro Lanini
 * This class is a test class for the class WordGames
 */
public class Test {

    /**
     * This is a main method
     * @param args console arguments
     */
    public static void main(String[] args) {
        WordGames wg = new WordGames();
        System.out.println(wg.addHelloWorld("Mauro"));
        System.out.println(wg.getFullName("Mario","Rossi"));
    }
}
