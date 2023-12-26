import java.util.Scanner;

public class BMI1 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入身高（M）:");
		float i=Sc.nextFloat();
		System.out.println("请输入体重（kg）:");
		float j=Sc.nextFloat();
		float BMI=j/(i*i);
		if(BMI<18.5) {
			System.out.println("体重过轻");
		}if(30<=BMI&&BMI<35) {
			System.out.println("中度肥胖");
		}
	}
}
