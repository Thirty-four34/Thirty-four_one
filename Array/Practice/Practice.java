package Practice;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[][]=new int[5][8];
		int b[]=new int[a.length*a[0].length];
		System.out.println("����ǰ��");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*100);
				if(a[i][j]<10) {
					System.out.print("0"+a[i][j]+" ");
				}else {
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println(" ");
		}
		for(int i=0;i<a.length;i++) {
			System.arraycopy(a[i], 0, b, 8*i, a[i].length);
			}
		System.out.println("��ά����ת��Ϊһά���飺");
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("����");
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length;i++) {
		System.arraycopy(b, 8*i, a[i], 0, a[i].length);
		}
		System.out.println("�����");
		for(int i=0;i<a.length;i++) {
		System.out.println(Arrays.toString(a[i]));
		}
	}
}
