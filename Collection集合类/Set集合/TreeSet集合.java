package Set����;

import java.util.Comparator;
import java.util.TreeSet;
import ���.Student;

//�Զ���Ƚ���
class MyComparator implements Comparator<Student>{
	//�ȱȽ������ٱȽ�����
	@Override
	public int compare(Student o1, Student o2) {
		int num=o1.getAge()-o2.getAge();
		return num==0?o1.getName().compareTo(o2.getName()):num;
	}
	
}
public class TreeSet���� {

	public static void main(String[] args) {
//�Զ�����Ȼ˳��
		//�Զ�������ΪString����ʵ����compareTo����
		System.out.println("--------------�����ַ���----------------");
		method();
		//���һ��û��ʵ���������ݵķ���
			/*����ʱ��������´���
			 *Exception in thread " main " java . lang . ClassCastEXception :
			 *cn . itcast . set . Student cannot be cast to java . lang . comparable 
			 *TreeSet ����Ҫ�Դ洢��Ԫ�ؽ������򣬵��� Student ���߱����������
			 *java . lang . comparable �ӿڣ�ʵ������ӿڣ�ǿ�����������Ϊ�������Ȼ˳��
			 *�ղ���һ���࣬�洢�����ַ������������� String ��߱���Ȼ˳��
			 *class String implements comparableT
			 */
		//�������ʵ�����������ݵķ���
			//��Studentʵ��Comparable��CompateTo�����Ͳ��ᱨ����
		System.out.println("--------------�Զ�����Ȼ˳��----------------");
		method2();
		System.out.println("--------------�Զ���Ƚ���------------------");
//�Զ���Ƚ���
		method3();
	}
	//�洢�ַ���
	public static void method() {
		
		TreeSet<String> TS=new TreeSet<String>();
		TS.add("asdf");
		TS.add("hfg");
		TS.add("bvxf");
		TS.add("yt");
		TS.add("a");
		for(String S:TS) {
			System.out.println(S);
		}
	}
	//�Զ�����Ȼ˳��
	//�洢�Զ�����󣬸ö���һ��Ҫʵ��Comparable�ӿڵ�CompateTo����������������ʱ�ᱨ��
	//���ξ���Ϊ���Ȱ������������������ͬ����������
	//�˴�û�д洢���������䶼��ͬ�Ķ�������Ϊ��д��hashCode��equals������ԭ��
	public static void method2() {
		TreeSet<Student> TS=new TreeSet<Student>();
		TS.add(new Student("abc",98));
		TS.add(new Student("abc",98));
		TS.add(new Student("abc",78));
		TS.add(new Student("jhg",23));
		TS.add(new Student("okl",6));
		TS.add(new Student("zz",56));
		TS.add(new Student("zz",56));
		TS.add(new Student("zz",66));
		for(Student S:TS) {
			System.out.println(S);
		}
	}
	/*�Զ���Ƚ���
	 * ��Ϊ��ʱʹ�õ����Զ���Ƚ�����
	 * ���Լ�ʹ����Student��û��ʵ��Comparable�ӿڵ�CompateTo����Ҳû��ϵ��
	 * ��Ϊ������û�õ�CompateTo����
	 */	
	public static void method3() {
		//�˼��ϣ�TS��һ��Ҫ��TreeSet���вι��췽��ʵ�֣�new MyComparator()�����٣���
		//�����޷�ʵ���Զ���Ƚ���������ʵ���Զ�����Ȼ˳��
		TreeSet<Student> TS=new TreeSet<Student>(new MyComparator());
		TS.add(new Student("abc",98));
		TS.add(new Student("abc",98));
		TS.add(new Student("abc",78));
		TS.add(new Student("jhg",23));
		TS.add(new Student("okl",6));
		TS.add(new Student("zz",56));
		TS.add(new Student("zz",56));
		TS.add(new Student("zz",66));
		for(Student S:TS) {
			System.out.println(S);
		}
	}
}
