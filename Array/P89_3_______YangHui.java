import java.util.Scanner;

public class P89_3_______YangHui {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("������������");
		int num=Sc.nextInt();
		int[][] array=new int[num][];
		//��ͬ�������ò�ͬ������
		for(int i=0;i<array.length;i++) {
			array[i]=new int[i+1];
			//ÿ�еĵ�һ���������һ����Ϊ1
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
