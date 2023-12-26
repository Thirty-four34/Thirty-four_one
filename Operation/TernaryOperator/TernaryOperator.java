package TernaryOperator;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	while(true) {
	System.out.println("今天星期几？");
	int i=Sc.nextInt();
	String j=(i>=1&&i<=7)?(i>=1&&i<=5)?"今天是工作日":"今天是休息日":"请输入正确的星期几";
	//上一行嵌套的三元操作符类似于以下函数
	if(i>=1&&i<=7) {
		if(i>=1&&i<=5) {
			j="今天是工作日";
		}else {
			j="今天是休息日";
		}
	}else {
		j="请输入正确的星期几";
	}
	//到此处结束
	System.out.println(j);
	}
}
}
