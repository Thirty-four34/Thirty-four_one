import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		while(true) {
		System.out.println("��������ݣ�");
		int i=Sc.nextInt();
		if((i%4==0&&i%100!=0)||i%400==0) {
			System.out.println(i+"������\n");
		}else {
			System.out.println(i+"��������\n");
			}
		}
	}
}
