package List����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		method1();
	}private static void method1() {
		List list=new ArrayList();
		list.add(123);
		list.add("abc");
		list.add(3.4);
		//ʹ�õ�������������
	ListIterator it=list.listIterator();
	while(it.hasNext()) {
		Object o=it.next();
		if(o.equals(123))
		//�������ϵ��޸Ĺ���
			//coll.add(1234);
		/*�ܽ᣺�ڵ�����������ʱ���ܵ������ϵ��޸Ĺ��ܣ�����ᷢ�������޸ĵĴ���
		 * ���ǿ����õ��������޸Ĺ��ܣ�������Ϊ��ʱ�������Ѿ�����
		 * �������������Ԫ�ػ����޸�֮ǰ��
		 */
		//ʹ�õ��������޸Ĺ���
			it.add(1234);
		System.out.println(o);
		}
	System.out.println(list);
	//ʹ��forѭ��+size+get��������
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
}
