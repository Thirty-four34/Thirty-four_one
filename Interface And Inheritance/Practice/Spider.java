package Practice;

public class Spider extends Animal {

	 protected Spider() {
		super(8);
		System.out.println("所有的蜘蛛有"+this.legs+"条腿");
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("蜘蛛吃昆虫");
	}
	public static void main(String[] args) {
		Spider Sp=new Spider();
		Sp.eat();
	}
}
