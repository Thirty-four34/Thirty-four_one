package string;

import java.util.Arrays;
import java.util.Random;

public class Practice2 {
	String Str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String S;
	Random Ran=new Random();
	public Practice2() {
		String S[]=new String[8];
		char ch[]=new char[5];
	for(int j=0;j<S.length;j++) {
		for(int i=0;i<ch.length;i++) {
			int num=Ran.nextInt(Str.length());
			ch[i]=Str.charAt(num);
			}
		S[j]=new String(ch);		
		}
		System.out.println("ÅÅÐòÇ°£º");
		System.out.println(Arrays.toString(S));
		System.out.println("ÅÅÐòºó£º");
			this.Sort(S);
			
	}
	private void Sort(String[] S) {
		for(int i=0;i<S.length;i++) {
			for(int j=i;j<S.length;j++) {
				if(((int)(Character.toLowerCase(S[i].charAt(0))))>
				((int)(Character.toLowerCase(S[j].charAt(0))))) {
					String str=S[i];
					S[i]=S[j];
					S[j]=str;
				}
			}
		}
		System.out.println(Arrays.toString(S));
	}
	public static void main(String[] args) {
		Practice2 prac=new Practice2();
	}
}
