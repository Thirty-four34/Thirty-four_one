package Bit;

import java.util.Scanner;


//不用乘法符号(*) 计算 2x16




public class Practice {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("请输入一个整数");
    
    long number = scan.nextLong();
    System.out.println("您输入的数值为："+number);
    System.out.println("该数字乘以16的运算结果为"+(number << 4));
}
}
