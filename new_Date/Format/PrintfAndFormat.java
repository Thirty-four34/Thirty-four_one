package Format;

import java.util.Locale;

public class PrintfAndFormat {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int year = 2020;
		//ֱ�Ӵ�ӡ����
        System.out.format("%d%n",year);
        //�ܳ�����8,Ĭ���Ҷ���
        System.out.format("%8d%n",year);
        //�ܳ�����8,�����
        System.out.format("%-8d%n",year);
        //�ܳ�����8,������0
        System.out.format("%08d%n",year);
        //ǧλ�ָ���
        System.out.format("%,8d%n",year*10000);
  
        //С����λ��
        System.out.format("%.2f%n",Math.PI);
          
        //��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
	}

}
