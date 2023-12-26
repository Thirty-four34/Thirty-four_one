package Practice;

public abstract class Animal {
	protected static  int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("通过"+this.legs+"条腿行走");
	}
	public static void main(String[] args) {
		Animal Am=new Cat("小花");
		Am.eat();
		
	}
}
