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
	System.out.println("����ά����תΪһά������ڲ����ظ��ַ�ת��");
for(int i=0;i<S.length;i++) {
System.arraycopy(S[i], 0, s0, 20*i, S[i].length);
	}
System.out.println(Arrays.toString(s0));
//�����ظ��ַ���
	String st="";//���ַ��������洢�ظ����ַ���
	int a=0;
		for(int j=0;j<s0.length-1;j++) {
			for(int k=j+1;k<s0.length;k++) {
				//�������st�Ѿ���¼���ַ�������������ѭ��
				if(st.contains(s0[j])) {
					break;
					}
//					if(st.contains(s0[k])) {
//						continue;
//					}//���ʹ�õ���s0[k]����һ��������break�����磺z,x,c,v,b,x,t,s,c
					//x�Ѿ���st��¼����s0[j]="c"ʱ��s0[k]Ϊb��������xʱ����break�Ļ�s�����c
					//���޷���⵼��st������¼c����ʱ�ͻ���ִ���
				
				//��¼�ظ����ַ�����������
				if(s0[j].equals(s0[k])) {
					st+=s0[j]+" ";
					a++;
					break;
				}
			}
		}
	String st1[]=st.split(" ");
	System.out.printf("�ܹ���%d���ظ����ַ���\n�ֱ���:",a);
	for(String s:st1) {
		System.out.print(s+" ");
	}
	}
}
