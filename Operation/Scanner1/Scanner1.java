package Scanner1;

import java.util.Scanner;

public class Scanner1 {
		public static void main(String[] args) {
			int a[]=new int[10];
			System.out.println("������һά�����ʮ��ֵ��");
			Scanner Sc=new Scanner(System.in);
			for(int i=0;i<a.length;i++) {
				a[i]=Sc.nextInt();
				System.out.print(a[i]+" ");
		}
	}
}
