package List集合;

import java.util.LinkedList;
import java.util.ListIterator;
	/*
	 * 封装集合LinkedList,以及功能add，isEmpty，removeLast定义到一个类中
	 * 对于调用者，使用我们提供的类，不直接面对集合
	 */
public class Demo自定义类_封装集合 {
	//定义三个方法，封装集合的三个方法
	//集合定义为成员属性
	private LinkedList LL;
	//使用无参的构造方法创建集合容器
	public Demo自定义类_封装集合() {
		LL=new LinkedList();
	}
	public void add(Object o) {
		LL.add(o);
	}
	public boolean isNotEmpty() {
		return !LL.isEmpty();
	}
	public Object removeLast() {
		return LL.removeLast();
	}
	public static void main(String[] args) {
		Demo自定义类_封装集合 D=new Demo自定义类_封装集合();
		D.add("idj");
		D.add(123);
		D.add(false);
		D.add(3.4);
		//ListIterator li=D.LL.listIterator();
		while(D.isNotEmpty()) {
			System.out.println(D.removeLast());
		}
	}
}
