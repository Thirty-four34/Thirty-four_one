package ����;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import ���.Student;

public class �洢�Զ������__ʹ�÷��� {
		public static void main(String[] args) {
			List<Student> li=new ArrayList<Student>();
			li.add(new Student("a",45));
			li.add(new Student("b",32));
			li.add(new Student("c",15));
			li.add(new Student("d",73));
			li.add(new Student("e",96));
			//�������ķ���Ҫ�ͼ��ϵ�һ��
			ListIterator<Student> LI=li.listIterator();
			while(LI.hasNext()) {
				//next()�������ص�Ԫ�ز�����object�࣬���Ƿ��͵�����
				//���Բ���Ҫǿ��ת��
				Student st=LI.next();
				System.out.println(st.getName()+"..."+st.getAge());
			}
		}
}
