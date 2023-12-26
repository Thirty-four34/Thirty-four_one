package 泛型;

//注：构造方法没有泛型
public class 泛型方法<TT> {
	/*
	 * 在方法上(形参的位置上)定义泛型，泛型跟随类走
	 * 创建对象的时候，就能指定数据类型
	 */
	public void get(TT t) {
		System.out.println(t);
	}
	/*
	 * 如果方法中的泛型，不想跟随类，变量名字不能和类上的泛型同名*在方法的声明上定义出泛型
	 *不能在创建对象的时候指定类型
	 *调用方法的时候，传递什么，表示什么，不用提前定义类型
	 */
	public <E>void set(E e){
		System.out.println(e);		
	}
	public static void main(String[] args) {
		泛型方法<String> ss=new 泛型方法<String>();
		ss.get("gd");
		//ss.get(8.7);使用String以外的类型会报错
		ss.set(234);
		ss.set(false);
	}
}
