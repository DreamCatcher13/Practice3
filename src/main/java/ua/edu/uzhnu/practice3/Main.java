package ua.edu.uzhnu.practice3;

/**
 * Created by Таня on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        HuffmanEncoder enigma = new HuffmanEncoder();
        EncodingResult t = enigma.encode("Тетяна");
        System.out.println(t.getEncodedMessage());
    }
}
