package compare;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Practice {
	public static void main(String[] args) {
	String Str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Random Ran=new Random();
		String S[][]=new String[5][20];
		char ch[]=new char[2];
	for(int j=0;j<S.length;j++) {
		for(int a=0;a<S[j].length;a++) {
			for(int i=0;i<ch.length;i++) {
			int num=Ran.nextInt(Str.length());
			ch[i]=Str.charAt(num);
					}
		S[j][a]=new String(ch);
		System.out.print(S[j][a]+" ");
				}
		System.out.println();
		}
	String s0[]=new String[100];
	System.out.println("将二维数组转为一维数组便于查找重复字符转：");
for(int i=0;i<S.length;i++) {
System.arraycopy(S[i], 0, s0, 20*i, S[i].length);
	}
System.out.println(Arrays.toString(s0));
//查找重复字符串
	String st="";//此字符串用来存储重复的字符串
	int a=0;
		for(int j=0;j<s0.length-1;j++) {
			for(int k=j+1;k<s0.length;k++) {
				//如果出现st已经收录的字符串就跳过本次循环
				if(st.contains(s0[j])) {
					break;
					}
//					if(st.contains(s0[k])) {
//						continue;
//					}//如果使用的是s0[k]，则一定不能用break；比如：z,x,c,v,b,x,t,s,c
					//x已经被st收录，当s0[j]="c"时，s0[k]为b后面的这个x时，用break的话s后面的c
					//就无法检测导致st不能收录c，此时就会出现错误
				
				//收录重复的字符串，并计数
				if(s0[j].equals(s0[k])) {
					st+=s0[j]+" ";
					a++;
					break;
				}
			}
		}
	String st1[]=st.split(" ");
	System.out.printf("总共有%d种重复的字符串\n分别是:",a);
	for(String s:st1) {
		System.out.print(s+" ");
	}
	}
}
