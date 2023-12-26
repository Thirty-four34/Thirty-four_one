package ForEnhance;

public class ForEnhance {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]= {66,8,4,3,2};
		int max=0;
		for(int number : a) {
			if(max<number) {
				max=number;
			}
		}
		System.out.println(max);
	}

}
