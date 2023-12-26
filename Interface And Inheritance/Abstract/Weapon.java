package Abstract;

public class Weapon extends Item {
	int damage; //攻击力
	public boolean disposable() {
		// TODO 自动生成的方法存根
		return false;
	}
public static void main(String[] args) {
	Weapon We=new Weapon();
	We.effect();
}
}
