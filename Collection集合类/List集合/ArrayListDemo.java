package List����;
import ���.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	/*
	 * ��ΪList���Ͽ��Դ洢�ظ�Ԫ�����ԣ��ڴ���ϰɾ���ظ�Ԫ��
	 */
	public static ArrayList remove_member(ArrayList array) {
		//����һ���µļ������ڴ洢û���ظ���Ԫ��
		ArrayList AL=new ArrayList();
		ListIterator li=array.listIterator();
		while(li.hasNext()) {
			Student st=(Student) li.next();
			if(!AL.contains(st))/*
								*��Ϊ�˴�contains�������õ���st��
								*(��Ϊÿ���඼��̳�Object������Ҳ����˵��Object��)equals����(�Ƚϵ�ַ)
								*���Ҫ���������������Ƿ���ͬ���жϣ��͵���дst��equals����
								*/
				AL.add(st);
		}
		return AL;
	}
	
	
	/*y
	 * ArrayList���ϴ洢�Զ������ͣ���������
	 */
	public static void method() {
		ArrayList al=new ArrayList();
		al.add(new Student("a",98));
		al.add(new Student("b",34));
		al.add(new Student("c",53));
		al.add(new Student("d",4));
		al.add(new Student("e",72));
		al.add(new Student("f",16));
		Iterator it=al.iterator();
		while(it.hasNext()) {
			/*
			 * ��Ϊit.next()ȡ�õ�Ԫ�ػ��Զ�ת��ΪObject�࣬
			 * ������Ҫʹ��Ԫ�صķ����͵ý�it.next()�õ���Ԫ��ǿ��ת��Ϊ�ã�Ԫ�صģ�����
			 */			
			Student sd=(Student)it.next();
			System.out.println(sd.getName()+"..."+sd.getAge());
		}
	}
	public static void main(String[] args) {		
		//ArrayList���ϴ洢�Զ������ͣ�������
		method();
		//��ΪList���Ͽ��Դ洢�ظ�Ԫ�����ԣ��ڴ���ϰɾ���ظ�Ԫ��
		ArrayList al=new ArrayList();
		al.add(new Student("a",98));
		al.add(new Student("b",34));
		al.add(new Student("c",53));
		al.add(new Student("d",4));
		al.add(new Student("e",72));
		al.add(new Student("e",72));
		al=remove_member(al);
		System.out.println(al);
		
		
	}

}
