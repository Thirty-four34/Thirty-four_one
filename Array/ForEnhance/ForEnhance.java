package ForEnhance;

public class ForEnhance {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
