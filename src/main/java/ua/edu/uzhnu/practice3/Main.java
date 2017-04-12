package ua.edu.uzhnu.practice3;

/**
 * Created by Таня on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        HuffmanEncoder enigma = new HuffmanEncoder();
        // дивилася як працює метод
        String s = "abcdefgh";
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1));
        s=s.substring(1);
        System.out.println(s.substring(0,1));
    }
}
