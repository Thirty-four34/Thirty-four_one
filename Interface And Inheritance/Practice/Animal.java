package Practice;

public abstract class Animal {
	protected static  int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("ͨ��"+this.legs+"��������");
	}
	public static void main(String[] args) {
		Animal Am=new Cat("С��");
		Am.eat();
		
	}
}
