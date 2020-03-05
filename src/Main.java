import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //1.Initiate a Set. Using For loop add integers from 1 to 10
        //2.Remove all odd numbers from sets.
        //3.Try to create a set with duplicate values

        //1.
        Set<Integer> adry = new HashSet<>();
        for (int i = 1; i < 11; i++) {
            adry.add(i);
        }
        System.out.println(adry);

        //2.
        Iterator<Integer> b = adry.iterator();
        while (b.hasNext()) {
            int odd = b.next();
            if (odd % 2 != 0) {
                b.remove();
            }
        }
        System.out.println(adry);

        //3.
        Set<Integer> duplicatenum = new HashSet<>();
        duplicatenum.add(2);
        duplicatenum.add(4);
        duplicatenum.add(2);
        duplicatenum.add(4);
        duplicatenum.add(5);
        System.out.println(duplicatenum);

    }
}

