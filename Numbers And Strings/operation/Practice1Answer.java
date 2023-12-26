package operation;

import java.util.StringJoiner;

public class Practice1Answer {
	public static void main(String[] args) {		
         String s =  "let there be light";
         System.out.println("转换之前:" + s);
         String [] s1 = s.split(" ");
         System.out.print("转换之后:");
         for(String each:s1){
             System.out.print(each.substring(0,1).toUpperCase()+each.substring(1) + " ");
         }
	}
}
