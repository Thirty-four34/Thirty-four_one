package Abstract;

public class Weapon extends Item {
	int damage; //������
	public boolean disposable() {
		// TODO �Զ����ɵķ������
		return false;
	}
public static void main(String[] args) {
	Weapon We=new Weapon();
	We.effect();
}
}
