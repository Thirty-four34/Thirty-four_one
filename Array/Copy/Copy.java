package Copy;

public class Copy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[]= {9,7,5,4,3};
		int b[]= {98,45,67,13,90,65};
		int c[]=new int[a.length+b.length ];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(int number : c) {
			System.out.print(number+" ");
		}
	}

}
