import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> n1 = new ArrayList<>(Arrays.asList(1,2,3,6,7,3,2,1));
        for (int i = 0; i < n1.size(); i++) {
            if (n1.get(i) == 2) {
                n1.remove(i);
            }
        }
        System.out.println(n1);

        //3.
        List<Integer> odd = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 3, 2, 1));
        int i = 0;
        for (int j = 0; j < odd.size(); j++) {
            if (odd.get(j) % 2 != 0) {
                odd.remove(j);
                j -= i;
                i++;
            }
        }
        System.out.println(odd);
    }
}