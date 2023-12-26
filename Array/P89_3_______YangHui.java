import java.util.Scanner;

public class P89_3_______YangHui {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入行数：");
		int num=Sc.nextInt();
		int[][] array=new int[num][];
		//不同的行设置不同的列数
		for(int i=0;i<array.length;i++) {
			array[i]=new int[i+1];
			//每行的第一个数和最后一个数为1
			for(int j=0;j<array.length;j++) {
					array[i][0]=array[i][i]=1;
		}
	}
		System.out.println("------------------------------");		
		
		for(int i=2;i<array.length;i++) {			
			for(int j=1;j<array[i].length-1;j++) {				
					array[i][j]=array[i-1][j-1]+array[i-1][j];				
			}
		}
		for(int i=0;i<array.length;i++) {			
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
