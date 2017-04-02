package ua.edu.uzhnu.practice3;

import java.util.Comparator;

/**
 * Created by Таня on 25.03.2017.
 */
public class CharNode implements Comparator<CharNode> {

    char value;
    int count;
    String huffmanCode;
    CharNode left;
    CharNode right;

    public CharNode(char value) {
        this.value = value;
    }

    public CharNode(CharNode left, CharNode right) {
        this.left = left;
        this.right = right;
        this.count = left.count + right.count;
    }

    public int incrementCount(){
        return count++;
    }


    public int compare(CharNode o1, CharNode o2) {
        return o1.compareTo(o2);
    }

}
