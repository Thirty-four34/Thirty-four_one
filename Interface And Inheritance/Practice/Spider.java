package Practice;

public class Spider extends Animal {

	 protected Spider() {
		super(8);
		System.out.println("���е�֩����"+this.legs+"����");
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("֩�������");
	}
	public static void main(String[] args) {
		Spider Sp=new Spider();
		Sp.eat();
	}
}
