package Bit;

import java.util.Scanner;


//���ó˷�����(*) ���� 2x16




public class Practice {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("������һ������");
    
    long number = scan.nextLong();
    System.out.println("���������ֵΪ��"+number);
    System.out.println("�����ֳ���16��������Ϊ"+(number << 4));
}
}
