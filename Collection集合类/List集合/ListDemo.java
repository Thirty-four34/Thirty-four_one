package List集合;

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
		//使用迭代器遍历集合
	ListIterator it=list.listIterator();
	while(it.hasNext()) {
		Object o=it.next();
		if(o.equals(123))
		//调动集合的修改功能
			//coll.add(1234);
		/*总结：在迭代器迭代的时候不能调动集合的修改功能，否则会发生并发修改的错误
		 * 但是可以用迭代器的修改功能，不过因为此时迭代器已经建立
		 * 所以下面遍历的元素还是修改之前的
		 */
		//使用迭代器的修改功能
			it.add(1234);
		System.out.println(o);
		}
	System.out.println(list);
	//使用for循环+size+get遍历集合
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
}
