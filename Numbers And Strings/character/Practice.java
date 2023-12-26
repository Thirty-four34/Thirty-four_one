package character;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner Sc=new Scanner(System.in);
		while(true) {	
			System.out.println("\n请输入字符串：");
		String S=Sc.next();
		char[] cs = S.toCharArray();
		//System.out.println(cs[0]);
		for(char c:cs) {
			if(Character.isUpperCase(c)|Character.isDigit(c)) {
				System.out.print(c);
				}
			}
		}
	}

}
