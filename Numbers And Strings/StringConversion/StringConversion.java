package StringConversion;

public class StringConversion {
	public static void main(String[] args) {
		//�Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"	
		double d=3.14;
		Double D1=d;
		String Str=String.valueOf(d);
		String Str1=D1.toString();
		//�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14
		System.out.println(Str);
		double D=Double.parseDouble(Str);
		System.out.println(D);
		//����ַ����� 3.1a4��ת��Ϊ��������õ�ʲô��
//		String S="3.1a4";
//		D=Double.parseDouble(S);
//		System.out.println(D);
		//��ת������
	}
}
