package aaalme.stringproblems;


public class StringDigits {
    public static void main(String[] args) {
        String a = "4.5.6.-1a";
        System.out.println(a.matches("[a-zA-Z0-9]+"));

        for (char aa : a.toCharArray()) {
            if (Character.isLetter(aa)) {
                System.out.println("isLetter: " + aa);
            }
            if (Character.isDigit(aa)) {
                System.out.println("isDigit: " + aa);
            }
            if (!Character.isLetterOrDigit(aa)) {
                System.out.println("isLetterOrDigit: " + aa);
            }
        }
    }
}