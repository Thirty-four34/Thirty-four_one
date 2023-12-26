package Thirty;

import java.util.Scanner;

public class Four {
public static void main(String[] args) {
	System.out.println("请输入第一个数");
	Scanner Sc=new Scanner(System.in);
	int i=Sc.nextInt();
	System.out.println("请输入第二个数");
	int j=Sc.nextInt();
	int a=i+j;
	System.out.println("两数之和为："+a);
}
}
