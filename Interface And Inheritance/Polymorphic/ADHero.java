package Polymorphic;

public class ADHero extends Hero implements Mortal {

	public void die() {
		// TODO 自动生成的方法存根
		System.out.println("被打死");
	}
	public static void battleWin(){
        System.out.println(" AD hero battle win");
    }
	public static void main(String[] args) {
		Hero h=new ADHero();
		h.battleWin();
	}
}
