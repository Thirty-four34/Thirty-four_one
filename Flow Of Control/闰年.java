import java.util.Scanner;

public class 闰年 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		while(true) {
		System.out.println("请输入年份：");
		int i=Sc.nextInt();
		if((i%4==0&&i%100!=0)||i%400==0) {
			System.out.println(i+"是闰年\n");
		}else {
			System.out.println(i+"不是闰年\n");
			}
		}
	}
}
