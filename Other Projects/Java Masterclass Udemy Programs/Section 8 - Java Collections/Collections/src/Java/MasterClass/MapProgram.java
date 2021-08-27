package Java.MasterClass;

import java.util.HashMap;
import java.util.Map;

//used to be Map, but Map is a reserved word
public class MapProgram {

    public static void main(String[] args) {
        //utilizing a generic for maps
        //to get around using a reserved word as a class name use java.util.Map to get around it
        //best to just change the class name using a refactor
//        java.util.Map<String, String> languages = new HashMap<>();

        //There is no guarantee that the items will be in any particular
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java"))
        {
            System.out.println("Java already exists");
        }
        else
        {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, objected-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        //this checks if a String is already implemented
        if (languages.containsKey("Java"))
        {
            System.out.println("Java is already in the map");
        }
        else
        {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=============================================================================");

        //languages.remove("Lisp");

        //this works due to the the data being exact as the languages.put
        if (languages.remove("Algol", "an algorithmic language"))
        {
            System.out.println("Algol removed");
        }
        else
        {
            System.out.println("Algol not removed, key/value pair not found");
        }

        //in order to replace a item, the oldvalue must match what was created with languages.put
        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features"))
        {
            System.out.println("Lisp replaced");
        }
        else
        {
            System.out.println("Lisp was not replaced");
        }

        //System.out.println(languages.replace("Scala", "this will not be added"));

        //This uses a set which will be covered later
        for (String key : languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
