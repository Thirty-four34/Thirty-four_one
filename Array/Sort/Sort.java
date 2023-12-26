package Sort;

public class Sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]=new int[5];
		int j=0;
		System.out.println("排序前：");
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("选择排序从小到大：");
		for(int i=0;i<a.length;i++) {
			for(int k=i;k<a.length;k++) {
				if(a[i]>a[k]) {
					j=a[i];
					a[i]=a[k];
					a[k]=j;					
					}
				}
			System.out.print(a[i]+" ");
			}
		System.out.println("\n冒泡排序从大到小：");
		for(int i=0;i<a.length;i++) {	
			for(int k=a.length-1;k>0;k--) {
				if(a[k]>a[k-1]) {
					j=a[k-1];
					a[k-1]=a[k];
					a[k]=j;					
					}				
				}	
			System.out.print(a[i]+" ");
			}
		}
			}
