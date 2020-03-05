import javax.naming.NameAlreadyBoundException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // 1. Write a Java program to test if a map contains a mapping for the specified key.
        // 2. Write a Java program to copy all of the mappings from the specified map to another map.
        // 3.Remove a value from HashMap based on key

        //1.
        HashMap<String, Integer> nameage = new HashMap<>();
        nameage.put("John", 29);
        nameage.put("Mary", 34);
        nameage.put("Mark", 28);
        nameage.put("Hellen", 33);
        System.out.println(nameage.get("Mary"));

        //2.
        HashMap<String, Integer> nameage1 = new HashMap<>();
        nameage1.putAll(nameage);
        System.out.println(nameage1);

        //3.
        nameage.remove("Hellen");
        System.out.println(nameage);
    }
}
