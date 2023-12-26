package Practice;

public class Fish extends Animal implements pet {
	private String name;
	protected Fish(int legs) {
		super(legs);
		// TODO 自动生成的构造函数存根
	}
	protected Fish() {
		this(0);
	}
	public void walk() {
		System.out.println("鱼没有腿，且不能行走");
	}
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println(name+"吃水藻");
	}
	@Override
	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return name;
	}
	@Override
	public void play() {
		// TODO 自动生成的方法存根
		System.out.println(name+"跃龙门");
	}
	public static void main(String[] args) {
		Fish F=new Fish();
		F.setName("小鱼");
		F.eat();
		F.walk();
		F.play();
	}
}
