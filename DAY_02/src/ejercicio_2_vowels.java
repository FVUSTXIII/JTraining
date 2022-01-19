import com.faust.vowels.VowelSeeker;

import java.util.Scanner;

public class ejercicio_2_vowels {
    public static void main(String[] args) {
        System.out.println("Enter the string to analyze...");
        String string_to_analyze = new Scanner(System.in).nextLine();
        System.out.println("how often do you want to check...");
        int frequency = new Scanner(System.in).nextInt();
        System.out.println("every " + frequency + " characters");
        VowelSeeker v_s = new VowelSeeker(frequency, string_to_analyze);
        System.out.println("the resulting string is : " + v_s.getResulting_string());
    }

}
