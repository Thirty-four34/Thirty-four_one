package Maths;

public class Prime {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=0;
		for(int i=2;i<=10000000;i++) {
			for(int j=i-1;j>1;j--) {
				if(i%j==0) {
					a++;
					break;
				}
			}
		}
		System.out.println(10000000-a-1);
//		System.out.printf("sadh");
	}

}
