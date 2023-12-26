package Date_Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );		
		Date a1=new Date(0);
		Long a=a1.getTime();
		String two="2000-12-31 23:59:59";		
		Long b=null;
		try {
			b=sdf.parse(two).getTime();
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		Date[][] Da=new Date[3][3];
		System.out.println("得到的随机数组：");
		for(int i=0;i<Da.length;i++) {
			for(int j=0;j<Da[i].length;j++) {
				long c=(long)(Math.random()*(b-a))+a;
				Da[i][j]=new Date(c);
				String Str=sdf.format(Da[i][j]);
				System.out.print(Str+"    ");
			}
			System.out.println();
		}
		Date[] Dat=new Date[9];		
		Long[] L=new Long[9];
		for(int i=0;i<Da.length;i++) {
			System.arraycopy(Da[i], 0, Dat, i*3, Da[i].length);
		}
		//System.out.println(Arrays.toString(Dat));
		for(int i=0;i<Dat.length;i++) {
			Long x=Dat[i].getTime();
			L[i]=x;
		}
		for(int i=0;i<L.length-1;i++) {
			for(int j=i+1;j<L.length;j++) {
				if(L[i]>L[j]) {
					Long v=L[j];
					L[j]=L[i];
					L[i]=v;
				}
			}
		}
		for(int i=0;i<Dat.length;i++) {
			Dat[i]=new Date(L[i]);
		}
	//	System.out.println(Arrays.toString(Dat));
		for(int i=0;i<Da.length;i++) {
			System.arraycopy(Dat, i*3, Da[i], 0,Da[i].length );
		}
		System.out.println("排序后的随机日期数组：");
		for(int i=0;i<Da.length;i++) {
			for(int j=0;j<Da[i].length;j++) {								
				String Str=sdf.format(Da[i][j]);
				System.out.print(Str+"    ");
			}
			System.out.println();
		}
	}
}
