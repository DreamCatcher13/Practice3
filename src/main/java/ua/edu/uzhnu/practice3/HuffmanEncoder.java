package ua.edu.uzhnu.practice3;

import java.util.*;


/**
 * Created by Таня on 25.03.2017.
 */
public class HuffmanEncoder {

   public EncodingResult encode(String message){
       Map<Character, CharNode> map1 = new HashMap<Character, CharNode>();
       int t = message.length();
       for ( int i = 0; i<t; i++) {
           char c = message.charAt(i);
           if (!map1.containsKey(c)) {
               map1.put(c, new CharNode(c));
           } else if (map1.containsKey(c)) {
               CharNode cn = map1.get(c);
               cn.incrementCount();
               map1.put(c, cn);
           }
       }
       List<CharNode> second = new ArrayList<CharNode>(map1.values());
       while (second.size()!= 1){
           int min = second.get(0).count;
           int ind = 0;
           for (int i = 1; i<second.size(); i++){
               if (second.get(i).count <= min){
                   min = second.get(i).count;
                   ind = i;
               }
           }
           CharNode nodeRight = second.get(ind);
           second.remove(ind);
           min = second.get(0).count;
           ind = 0;
           for ( int i = 1; i<second.size(); i++){
               if (second.get(i).count <= min){
                   min = second.get(i).count;
                   ind = i;
               }
           }
           CharNode nodeLeft = second.get(ind);
           second.remove(ind);
           second.add(new CharNode(nodeLeft, nodeRight));
       }
       second.get(0).setHuffmanCode("");
       List<CharNode> third = new ArrayList<CharNode>(map1.values());
       List<CharNode> fourth = new ArrayList<CharNode>();
       while (fourth.size()!= third.size()){
           int  i = 0;
           if (second.contains(third.get(i))){
               fourth.add(third.get(i));
           }
           i++;
       }
       Map<String, Character> map2 = new HashMap<String, Character>();
       for (int i = 0; i < fourth.size(); i++){
       map2.put(fourth.get(i).huffmanCode, fourth.get(i).value);
       }
       Map<Character, String> map3 = new HashMap<Character, String>();
       for (int i = 0; i < fourth.size(); i++){
           map3.put(fourth.get(i).value, fourth.get(i).huffmanCode);
       }
       String encoded = new String();
       for ( int i = 0; i<map3.size(); i++) {
           if (map3.containsKey(message.charAt(i))) {
               encoded += map3.get(message.charAt(i));
           }
       }
       return new EncodingResult(encoded, map2);
   }





   public String decode (String Message, Map<String, Character> charTable ){
       return null;

   }
}
