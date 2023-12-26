package string;

import java.util.Random;

public class Practice3 {
	static String Str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String S;
	static Random Ran=new Random();
	static void password() {
		char ch[]=new char[3];
		for(int i=0;i<ch.length;i++) {
			int num=Ran.nextInt(Str.length());
			ch[i]=Str.charAt(num);
		}
		System.out.println("随机生成密码：");		
		S=new String(ch);
		System.out.println(S);
		System.out.println("匹配的密码为：");
		seek(S);		
	}
	static void seek(String S) {
		int a=0;
		char[] ch=new char[S.length()];
		for(int i=0;i<S.length();i++) {
			for(short j=0;j<128;j++) {
				ch[i]=(char)j;
				if(ch[i]!=S.charAt(i)) {
					a++;
				}else {
					System.out.print(ch[i]);
					break;
				}
			}
		}
		System.out.println("\n尝试匹配的次数为："+a);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		password();
	}

}
