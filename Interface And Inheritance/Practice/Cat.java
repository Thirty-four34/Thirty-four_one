package Practice;

public class Cat extends Animal implements pet {
	String name;
	protected Cat(String name) {
		super(4);
		System.out.println("所有的猫咪都有"+this.legs+"条腿");
		super.walk();
		this.setName(name);
		
	}
	public Cat() {
		this(" ");
	}
	@Override
	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return this.name;
	}

	@Override
	public void play() {
		// TODO 自动生成的方法存根
		System.out.println(name+"喜欢玩毛线球");
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
System.out.println(name+"吃鱼");
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.setName("小咪");
		cat.play();
		cat.eat();
	}
}
