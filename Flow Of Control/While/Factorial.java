package While;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		while(true) {	
		System.out.println("\n请输入数值：");
		int number=Sc.nextInt();
		int i=number;
		int j=number;
		while(number>1) {
			i*=number-1;
			number--;
			}
		System.out.println(j+"的阶乘为："+i);
		}
	}	
}
