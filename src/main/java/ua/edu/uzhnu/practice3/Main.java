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
       /* while (copy.length()!=0) {
            if (charTable.containsKey(copy.substring(i, i + 1))) {
                decoded += charTable.get(copy.substring(i, i + 1));
                copy = copy.substring(i + 1);
            } else {
                i++;
            }
        }*/
        /*int i = 1;
        for (int p = 0; p < t; p+=i) {
            for ( i = i; ; i++) {
                if (charTable.containsKey(copy.substring(p, i))) {
                    decoded += charTable.get(copy.substring(p, i));
                    copy = copy.substring(i);
                    break;
                }
            }
        }*/

    }
}
