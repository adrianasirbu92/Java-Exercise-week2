
public class Main {

    public static void main(String[] args) {
        int a = 0;
        do {a++;
        if (a % 5 == 0){
            System.out.println("Buzz");
        }
        if (a % 3 == 0) {
                System.out.println("Fizz");
            }
        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("FizzBuzz");
            }
        if (a % 3 != 0 && a % 5 != 0){
            System.out.println(a);
        }

        }while (a<100);

    }


}


