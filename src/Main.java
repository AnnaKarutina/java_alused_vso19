import java.util.Scanner;

public class Main {

    public static String reverse(String text) {
        // write your code here
        int i = text.length() - 1; // last symbol index
        String reverseText = "";
        while (i >= 0) {
            reverseText += text.charAt(i);
            i--;
        }
        return reverseText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
