package List����;

import java.util.LinkedList;
import java.util.ListIterator;
	/*
	 * ��װ����LinkedList,�Լ�����add��isEmpty��removeLast���嵽һ������
	 * ���ڵ����ߣ�ʹ�������ṩ���࣬��ֱ����Լ���
	 */
public class Demo�Զ�����_��װ���� {
	//����������������װ���ϵ���������
	//���϶���Ϊ��Ա����
	private LinkedList LL;
	//ʹ���޲εĹ��췽��������������
	public Demo�Զ�����_��װ����() {
		LL=new LinkedList();
	}
	public void add(Object o) {
		LL.add(o);
	}
	public boolean isNotEmpty() {
		return !LL.isEmpty();
	}
	public Object removeLast() {
		return LL.removeLast();
	}
	public static void main(String[] args) {
		Demo�Զ�����_��װ���� D=new Demo�Զ�����_��װ����();
		D.add("idj");
		D.add(123);
		D.add(false);
		D.add(3.4);
		//ListIterator li=D.LL.listIterator();
		while(D.isNotEmpty()) {
			System.out.println(D.removeLast());
		}
	}
}
