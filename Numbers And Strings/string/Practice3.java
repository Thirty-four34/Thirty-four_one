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
		System.out.println("����������룺");		
		S=new String(ch);
		System.out.println(S);
		System.out.println("ƥ�������Ϊ��");
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
		System.out.println("\n����ƥ��Ĵ���Ϊ��"+a);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		password();
	}

}
