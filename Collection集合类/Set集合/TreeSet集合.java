package Set集合;

import java.util.Comparator;
import java.util.TreeSet;
import 配件.Student;

//自定义比较器
class MyComparator implements Comparator<Student>{
	//先比较年龄再比较姓名
	@Override
	public int compare(Student o1, Student o2) {
		int num=o1.getAge()-o2.getAge();
		return num==0?o1.getName().compareTo(o2.getName()):num;
	}
	
}
public class TreeSet集合 {

	public static void main(String[] args) {
//自定义自然顺序
		//自动排序，因为String类中实现了compareTo方法
		System.out.println("--------------排序字符串----------------");
		method();
		//情况一：没有实现排序依据的方法
			/*运行时会出现以下错误
			 *Exception in thread " main " java . lang . ClassCastEXception :
			 *cn . itcast . set . Student cannot be cast to java . lang . comparable 
			 *TreeSet 集合要对存储的元素进行排序，但是 Student 不具备排序的依据
			 *java . lang . comparable 接口，实现这个接口，强制排序，排序成为对象的自然顺序
			 *刚才上一个类，存储的是字符串，可以排序， String 类具备自然顺序
			 *class String implements comparableT
			 */
		//情况二：实现了排序依据的方法
			//让Student实现Comparable的CompateTo方法就不会报错了
		System.out.println("--------------自定义自然顺序----------------");
		method2();
		System.out.println("--------------自定义比较器------------------");
//自定义比较器
		method3();
	}
	//存储字符串
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
	//自定义自然顺序
	//存储自定义对象，该对象一定要实现Comparable接口的CompateTo方法，否则在运行时会报错
	//本次举例为：先按名字排序，如果名字相同则按年龄排序，
	//此处没有存储姓名和年龄都相同的对象是因为重写了hashCode和equals方法的原因
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
	/*自定义比较器
	 * 因为此时使用的是自定义比较器，
	 * 所以即使对象（Student）没有实现Comparable接口的CompateTo方法也没关系，
	 * 因为本来就没用到CompateTo方法
	 */	
	public static void method3() {
		//此集合（TS）一定要用TreeSet的有参构造方法实现（new MyComparator()不能少），
		//否则无法实现自定义比较器，而是实现自定义自然顺序
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
