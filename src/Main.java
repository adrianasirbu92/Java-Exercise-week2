public class Main {

    public static void main(String[] args) {
        //Create a method that will check if a given string is a palindrome.
        // If it is it should print “This string is a palindrome”
        // if not print “This string is not a palindrome”
        String original = "racecar";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        boolean palindrome = false;
        for (int i = 0; i < original.length(); i++) {

            palindrome = true;
        }
        if (palindrome) {
            System.out.println("This string is a palindrome");

        }else{
            System.out.println("This is not a palindrome");

        }
    }
}
