package Practice;

public class Fish extends Animal implements pet {
	private String name;
	protected Fish(int legs) {
		super(legs);
		// TODO �Զ����ɵĹ��캯�����
	}
	protected Fish() {
		this(0);
	}
	public void walk() {
		System.out.println("��û���ȣ��Ҳ�������");
	}
	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println(name+"��ˮ��");
	}
	@Override
	public void setName(String name) {
		// TODO �Զ����ɵķ������
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return name;
	}
	@Override
	public void play() {
		// TODO �Զ����ɵķ������
		System.out.println(name+"Ծ����");
	}
	public static void main(String[] args) {
		Fish F=new Fish();
		F.setName("С��");
		F.eat();
		F.walk();
		F.play();
	}
}
