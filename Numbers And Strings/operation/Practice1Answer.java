package operation;

import java.util.StringJoiner;

public class Practice1Answer {
	public static void main(String[] args) {		
         String s =  "let there be light";
         System.out.println("ת��֮ǰ:" + s);
         String [] s1 = s.split(" ");
         System.out.print("ת��֮��:");
         for(String each:s1){
             System.out.print(each.substring(0,1).toUpperCase()+each.substring(1) + " ");
         }
	}
}
