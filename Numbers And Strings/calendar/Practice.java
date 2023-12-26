package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		// TODO 自动生成的方法存根		
		Date one=new Date();
		System.out.println("今天是："+sdf.format(one));
		Calendar Ca=Calendar.getInstance();
		Ca.setTime(one);
		//原来是下下月减去三天，才是下月最后三天
		Ca.add(Calendar.MONTH, 2);
		//Ca.set(Calendar.DATE, -3);错误的倒推
		Ca.set(Calendar.DATE, 1);//设定时间为9月1号
       Ca.add(Calendar.DATE, -3);//从9月1号倒退3天
        System.out.println("下个月的倒数第三天:" +sdf.format(Ca.getTime()));
	       //这一年的第几天
		 System.out.println("这一年的第"+ Ca.get(Calendar.DAY_OF_YEAR)+"几天");
	}
}
