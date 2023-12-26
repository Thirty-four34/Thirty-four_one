package Collection_集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
		public static void main(String[] args) {
			method1();
		}
		private static void method1() {
			Collection coll=new ArrayList();
			coll.add(123);
			coll.add("abc");
			coll.add(3.4);
		Iterator it=coll.iterator();
		while(it.hasNext()) {
			/*
			 * 每使用一次next()，指针都会下移，所以遍历时循环中尽量保证
			 * 一次循环只使用一次next()
			 */
			Object o=it.next();			
			System.out.println(o);
			}
		}
}
