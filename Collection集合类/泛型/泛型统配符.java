package ����;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * ����������
 *һ���� ArrayList ��һ���� LinkedList �洢�˲�ͬ��������
 *���巽��������������
 */
//ע��ͳ���"?"ͨ������������û����������
public class ����ͳ��� {
	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("a");
		AL.add("b");
		AL.add("c");
		AL.add("d");
		
		LinkedList<Integer> LL=new LinkedList<Integer>();
		LL.add(123);
		LL.add(567);
		LL.add(98);
		LL.add(328);
		
		Itetor(AL);
		Itetor(LL);
	}
	private static void Itetor(List<?> li) {//����ͳ�����?��,�˴�ʹ��List����Ϊ
											//List��ArrayList��LinkedList�Ľӿ�
											//�˴��õ��˶�̬
		Iterator<?> I=li.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
	}
}
