package Format;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("�����������");
		String S=Sc.next();
		System.out.println("�����빫˾���ͣ�");
		String S1=Sc.next();
		System.out.println("�����빫˾���ƣ�");
		String S2=Sc.next();
		System.out.println("�������ϰ����ƣ�");
		String S3=Sc.next();
		System.out.println("�������");
		int S4=Sc.nextInt();
		System.out.println("�������Ʒ��");
		String S5=Sc.next();
		System.out.println("������۸������λ��");
		String S6=Sc.next();
		String St="%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ��%d���ڣ�%n"
				+ "��������С�������ˣ�����û�а취������%s�ֹ��ʣ�ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s��%n"
				+ "����ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ�飡%s���˵����㲻���ˣ�����������������˴���꣬%n"
				+ "�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ��";
	System.out.printf(St,S,S1,S2,S3,S4,S5,S6,S6,S6,S5,S3);
	}
}
