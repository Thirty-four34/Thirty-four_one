package 泛型;

/*
 *定义接口，带泛型
 *两个变化：
	1．实现类实现接口不理会泛型
	在创建实现类对象的时候，再指定数据类型灵活性比较好，集合中，都是采用这样的方式
	2．实现类实现接口同时实现泛型
	实现类实现接口时候，泛型就写好了，创建实现类的对象无法指定泛型
 */

//情况一(通常使用这种方式)：
interface MyInter<E>{
	public void show(E e);
}
class MyInterImpl<E> implements MyInter<E>{

	@Override
	public void show(E e) {
		// TODO 自动生成的方法存根
		System.out.println(e);
	}
	
}
//情况二：
class MyInterImpl2 implements MyInter<String>{

	@Override
	public void show(String e) {
		// TODO 自动生成的方法存根
		System.out.println(e);
	}
	
}
public class 泛型接口 {
	public static void main(String[] args) {
		MyInter<Integer> mI=new MyInterImpl<Integer>();
		mI.show(342);
		MyInter<Boolean> mi2=new MyInterImpl<Boolean>();
		mi2.show(false);
		
		MyInterImpl2 m=new MyInterImpl2();
		m.show("abcd");//只能使用String类型
	}

}
