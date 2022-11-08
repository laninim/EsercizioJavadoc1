package it.develhope.javadoc;

/**
 * @author Mauro Lanini
 * This class rappresent
 */
public class WordGames {

    /**
     * This method take a name and return a hello
     * @param name the name for concat hello
     * @return a string with a hello + name
     */
    public String addHelloWorld(String name){
        return "Hello " + name;
    }

    /**
     * This method create a concatenation from name and surname
     * @param name the string name
     * @param surname the string surname
     * @return return a string with a concatenation of name and surname param
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
