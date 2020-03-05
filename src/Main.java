import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.*;

public class Main {
   /* 1. Initiate an Arraylist. Using For loop add integers from 1 to 10
      2.Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
      3.Remove all odd numbers;*/

    public static void main(String[] args) {

        //1.
        List<Integer> numbers = new ArrayList<>(Arrays.asList());
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        //2.
        List<Integer> n1 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));
        n1.removeAll(Arrays.asList(2));
        System.out.println(n1);


        //3.
        Iterator<Integer> iteratornum = numbers.iterator();
        while (iteratornum.hasNext()) {
            int num = iteratornum.next();
            if (num % 2 != 0 ) {
                iteratornum.remove();
            }
        }
        System.out.println(numbers);
    }}
       