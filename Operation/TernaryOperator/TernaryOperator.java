package TernaryOperator;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	while(true) {
	System.out.println("�������ڼ���");
	int i=Sc.nextInt();
	String j=(i>=1&&i<=7)?(i>=1&&i<=5)?"�����ǹ�����":"��������Ϣ��":"��������ȷ�����ڼ�";
	//��һ��Ƕ�׵���Ԫ���������������º���
	if(i>=1&&i<=7) {
		if(i>=1&&i<=5) {
			j="�����ǹ�����";
		}else {
			j="��������Ϣ��";
		}
	}else {
		j="��������ȷ�����ڼ�";
	}
	//���˴�����
	System.out.println(j);
	}
}
}
