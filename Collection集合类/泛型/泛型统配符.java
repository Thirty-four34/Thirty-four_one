package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 有两个集合
 *一个是 ArrayList ，一个是 LinkedList 存储了不同数据类型
 *定义方法，做迭代集合
 */
//注：统配符"?"通常用作遍历，没有其他作用
public class 泛型统配符 {
	public static void main(String[] args) {
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("a");
		AL.add("b");
		AL.add("c");
		AL.add("d");
		
		LinkedList<Integer> LL=new LinkedList<Integer>();
		LL.add(123);
		LL.add(567);
		LL.add(98);
		LL.add(328);
		
		Itetor(AL);
		Itetor(LL);
	}
	private static void Itetor(List<?> li) {//泛型统配符“?”,此处使用List是因为
											//List是ArrayList和LinkedList的接口
											//此处用到了多态
		Iterator<?> I=li.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
	}
}
