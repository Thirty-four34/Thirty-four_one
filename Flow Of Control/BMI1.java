import java.util.Scanner;

public class BMI1 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("��������ߣ�M��:");
		float i=Sc.nextFloat();
		System.out.println("���������أ�kg��:");
		float j=Sc.nextFloat();
		float BMI=j/(i*i);
		if(BMI<18.5) {
			System.out.println("���ع���");
		}if(30<=BMI&&BMI<35) {
			System.out.println("�жȷ���");
		}
	}
}
