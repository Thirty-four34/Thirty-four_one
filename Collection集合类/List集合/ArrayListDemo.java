package List集合;
import 配件.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	/*
	 * 因为List集合可以存储重复元素所以，在此练习删除重复元素
	 */
	public static ArrayList remove_member(ArrayList array) {
		//创建一个新的集合用于存储没有重复的元素
		ArrayList AL=new ArrayList();
		ListIterator li=array.listIterator();
		while(li.hasNext()) {
			Student st=(Student) li.next();
			if(!AL.contains(st))/*
								*因为此处contains方法调用的是st的
								*(因为每个类都会继承Object类所以也可以说是Object的)equals方法(比较地址)
								*如果要根据姓名和年龄是否相同来判断，就得重写st的equals方法
								*/
				AL.add(st);
		}
		return AL;
	}
	
	
	/*y
	 * ArrayList集合存储自定义类型，并迭代；
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
			 * 因为it.next()取得的元素会自动转换为Object类，
			 * 所以想要使用元素的方法就得将it.next()得到的元素强制转换为该（元素的）类型
			 */			
			Student sd=(Student)it.next();
			System.out.println(sd.getName()+"..."+sd.getAge());
		}
	}
	public static void main(String[] args) {		
		//ArrayList集合存储自定义类型，并迭代
		method();
		//因为List集合可以存储重复元素所以，在此练习删除重复元素
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
