package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice {
public static void main(String[] args) {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String start = "1995-01-01 00:00:00";
    String end = "1995-12-31 23:59:59";    
    Long ceil = null;
	try {
		ceil = format.parse(start).getTime();
	} catch (ParseException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
    Long floor = null;
	try {
		floor = format.parse(end).getTime();
	} catch (ParseException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
    Long number = (long)(Math.random()*(floor-ceil)) + ceil;
    Date Da=new Date(number);
    System.out.println(Da);
    String Str=format.format(Da);
    System.out.println(Str);
}
}
