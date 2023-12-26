package Create;

public class Min {
public static void main(String[] args) {
	int a[]=new int[5];
	int min=1000;
	for(int i=0;i<a.length;i++) {
		a[i]=(int)(Math.random()*100);
		System.out.print(a[i]+" ");
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println(" ");
	System.out.println("最小值为："+min);
}
}
