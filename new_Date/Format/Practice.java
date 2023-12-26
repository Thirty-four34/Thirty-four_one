package Format;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入地名：");
		String S=Sc.next();
		System.out.println("请输入公司类型：");
		String S1=Sc.next();
		System.out.println("请输入公司名称：");
		String S2=Sc.next();
		System.out.println("请输入老板名称：");
		String S3=Sc.next();
		System.out.println("请输入金额：");
		int S4=Sc.nextInt();
		System.out.println("请输入产品：");
		String S5=Sc.next();
		System.out.println("请输入价格计量单位：");
		String S6=Sc.next();
		String St="%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下%d个亿，%n"
				+ "带着他的小姨子跑了！我们没有办法，拿着%s抵工资！原价都是一%s多、两%s多、三%s多的%s，%n"
				+ "现在全部只卖二十块，统统只要二十块！%s王八蛋，你不是人！我们辛辛苦苦给你干了大半年，%n"
				+ "你不发工资，你还我血汗钱，还我血汗钱！";
	System.out.printf(St,S,S1,S2,S3,S4,S5,S6,S6,S6,S5,S3);
	}
}
