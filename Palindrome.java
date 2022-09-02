import java.util.Scanner;

public class Palindrome {


    public void palindrome() {

        String saveWord = "";

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = in.nextLine();

        for (int i = (word.length())-1; i >= 0; i--) {
            saveWord = saveWord + word.charAt(i);
        }

        System.out.println(saveWord);
        if (saveWord.equals(word)) {
            System.out.println("Yes "+ word + " is Palindrome");
        } else {
            System.out.println("No "+ word + " is not Palindrome");
        }

    }

    public static void main(String args[]) {
        Palindrome obj = new Palindrome();
        obj.palindrome();
    }

}

