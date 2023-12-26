package Initialization;

public class Reverse {

	public static void main(String[] args) {
		int []a=new int[5];
		int min=100;
		System.out.println("反转前：");
		for(int i=0;i<a.length;i++) {
			a[i]=(int) (Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println("\n反转后：");
		for(int i=0;i<a.length/2;i++) {
			min=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=min;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
