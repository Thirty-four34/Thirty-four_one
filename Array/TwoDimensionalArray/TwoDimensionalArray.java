package TwoDimensionalArray;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][]=new int[5][5];
		int max=0;
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*100);				
				System.out.print(a[i][j]+" ");
				if(max<a[i][j]) {
					max=a[i][j];
					b=i;c=j;
				}
			}		
			System.out.println(" ");	
		}
		System.out.println("二维数组的最大值为："+max);
		System.out.println("最大值的坐标为："+"["+b+"]"+"["+c+"]");
	}
}
