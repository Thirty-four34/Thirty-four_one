package Polymorphic;

public class ADHero extends Hero implements Mortal {

	public void die() {
		// TODO �Զ����ɵķ������
		System.out.println("������");
	}
	public static void battleWin(){
        System.out.println(" AD hero battle win");
    }
	public static void main(String[] args) {
		Hero h=new ADHero();
		h.battleWin();
	}
}
