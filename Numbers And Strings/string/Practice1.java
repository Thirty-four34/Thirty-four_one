package string;

import java.util.Random;

public class Practice1 {
	String Str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String S;
	Random Ran=new Random();
	public Practice1() {
		char ch[]=new char[5];
		for(int i=0;i<ch.length;i++) {
			int num=Ran.nextInt(Str.length());
			ch[i]=Str.charAt(num);
		}
		S=new String(ch);
		System.out.println("������ɵ��ַ���Ϊ��\n"+S);
		System.out.println("�ַ�����ASCLL��Ϊ��");
		this.ASCLL(S);
	}
	public void ASCLL(String S) {
		char[] ch = S.toCharArray();
		for(int j=0;j<ch.length;j++) {
			for(int i=0;i<128;i++) {
				if((47<i&i<58)||(64<i&i<91)||(96<i&i<123)) {
					short sho=(short)ch[j];
					short sh=(short) i;
					if(sho==sh) {
					System.out.print(sh+" ");
						}
					}
				}
			}
		}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Practice1 Prac=new Practice1();
	}

}
