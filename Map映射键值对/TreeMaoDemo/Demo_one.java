package TreeMaoDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Demo_one {
    public static void main(String[] args) {
        String Str="aababcabcdabcde";
        char[] ch=Str.toCharArray();
        TreeMap<Character, Integer> tm = new TreeMap<Character,Integer>();
        for(char c:ch){
            Character C=(Character)c;
            if(!tm.containsKey(C)){
                tm.put(C,1);
            }else{
                Integer I=tm.get(C)+1;
                tm.put(C,I);
            }
        }
        Set<Character> set=tm.keySet();
        Iterator<Character> it=set.iterator();
        while (it.hasNext()) {
            Character c=it.next();
            System.out.print(c+"("+tm.get(c)+")");
        }
    }
}
