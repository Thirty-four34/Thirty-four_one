package ����;
import java.util.ArrayList;
import java.util.ListIterator;
/*
 *�������������Ա��������
 * super abstract job ()
 * Manager�޶� staff�޶� ��������洢�� ArrayList 
 *������������̨��ͬʱ�����г���job����
 *
 *�����޶�
 *���� �޶��Ǹ��ࣿ extends E ����?������ E ���ͣ������� E ����������
 *���� �޶������ࣿ super E 	����?������ E ���ͣ������� E �ĸ�������
 */
import ����.*;
public class �����޶� {
	public static void main(String[] args) {
		//�������ϣ��洢Manager�޶�����
		ArrayList<Manager�޶�> manager=new ArrayList<Manager�޶�>();
		manager.add(new Manager�޶�("����",101,78434.3,9832));
		manager.add(new Manager�޶�("����",120,928764.3,2232));
		
		//�������ϣ��洢staff�޶�����
		ArrayList<staff�޶�> staff=new ArrayList<staff�޶�>();
		staff.add(new staff�޶�("С��",21,7534.3));
		staff.add(new staff�޶�("С��",18,9764.3));
		
		method(manager);
		method(staff);
	}
	/*
	 *���巽����ͬʱ�����������ϣ����������У�����job����
	 *���ϵ����еķ������⣬���ݵļ��ϵķ����� Manager�޶� �� staff�޶� 
	 *�����඼�� Demo�޶������࣬ Demo�޶� Demo = new Manager�޶� (); C . job ()3
	 */
	private static void method(ArrayList<? extends Demo�޶�> AL) {
		ListIterator<? extends Demo�޶�> LI=AL.listIterator();
		while(LI.hasNext()) {
			Demo�޶� Demo= LI.next();
			Demo.job();
		}
	}
}
