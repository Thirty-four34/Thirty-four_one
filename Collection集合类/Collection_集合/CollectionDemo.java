package Collection_����;

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
			 * ÿʹ��һ��next()��ָ�붼�����ƣ����Ա���ʱѭ���о�����֤
			 * һ��ѭ��ֻʹ��һ��next()
			 */
			Object o=it.next();			
			System.out.println(o);
			}
		}
}
