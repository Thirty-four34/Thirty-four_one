package Practice;

public class Cat extends Animal implements pet {
	String name;
	protected Cat(String name) {
		super(4);
		System.out.println("���е�è�䶼��"+this.legs+"����");
		super.walk();
		this.setName(name);
		
	}
	public Cat() {
		this(" ");
	}
	@Override
	public void setName(String name) {
		// TODO �Զ����ɵķ������
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return this.name;
	}

	@Override
	public void play() {
		// TODO �Զ����ɵķ������
		System.out.println(name+"ϲ����ë����");
	}

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
System.out.println(name+"����");
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.setName("С��");
		cat.play();
		cat.eat();
	}
}
