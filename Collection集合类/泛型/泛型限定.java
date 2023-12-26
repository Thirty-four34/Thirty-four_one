package 泛型;
import java.util.ArrayList;
import java.util.ListIterator;
/*
 *案例，抽象类的员工，经理
 * super abstract job ()
 * Manager限定 staff限定 两个对象存储到 ArrayList 
 *迭代器两个集台，同时迭代中绸用job方法
 *
 *泛型限定
 *上限 限定是父类？ extends E 泛型?可以是 E 类型，可以是 E 的子类类型
 *下限 限定是子类？ super E 	泛型?可以是 E 类型，可以是 E 的父类类型
 */
import 泛型.*;
public class 泛型限定 {
	public static void main(String[] args) {
		//创建集合，存储Manager限定对象
		ArrayList<Manager限定> manager=new ArrayList<Manager限定>();
		manager.add(new Manager限定("张三",101,78434.3,9832));
		manager.add(new Manager限定("李四",120,928764.3,2232));
		
		//创建集合，存储staff限定对象
		ArrayList<staff限定> staff=new ArrayList<staff限定>();
		staff.add(new staff限定("小张",21,7534.3));
		staff.add(new staff限定("小李",18,9764.3));
		
		method(manager);
		method(staff);
	}
	/*
	 *定义方法，同时迭代两个集合，迭代过程中，绸用job方法
	 *集合迭代中的泛型问题，传递的集合的泛型是 Manager限定 和 staff限定 
	 *两个类都是 Demo限定的子类， Demo限定 Demo = new Manager限定 (); C . job ()3
	 */
	private static void method(ArrayList<? extends Demo限定> AL) {
		ListIterator<? extends Demo限定> LI=AL.listIterator();
		while(LI.hasNext()) {
			Demo限定 Demo= LI.next();
			Demo.job();
		}
	}
}
