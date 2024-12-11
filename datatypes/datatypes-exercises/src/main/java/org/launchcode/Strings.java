package org.launchcode;
import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {

        String str = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");

        String searchTerm = input.nextLine();

        String strLowerCase = str.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        Boolean result = strLowerCase.contains(searchTermLowerCase);
        System.out.println(result);

        int index = str.indexOf(searchTermLowerCase);
        int length = searchTermLowerCase.length();
        System.out.println("Index of search term is: " + index + "/n Length of search term is: "
        + length);

    }

}
