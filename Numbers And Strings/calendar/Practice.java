package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������		
		Date one=new Date();
		System.out.println("�����ǣ�"+sdf.format(one));
		Calendar Ca=Calendar.getInstance();
		Ca.setTime(one);
		//ԭ���������¼�ȥ���죬���������������
		Ca.add(Calendar.MONTH, 2);
		//Ca.set(Calendar.DATE, -3);����ĵ���
		Ca.set(Calendar.DATE, 1);//�趨ʱ��Ϊ9��1��
       Ca.add(Calendar.DATE, -3);//��9��1�ŵ���3��
        System.out.println("�¸��µĵ���������:" +sdf.format(Ca.getTime()));
	       //��һ��ĵڼ���
		 System.out.println("��һ��ĵ�"+ Ca.get(Calendar.DAY_OF_YEAR)+"����");
	}
}
