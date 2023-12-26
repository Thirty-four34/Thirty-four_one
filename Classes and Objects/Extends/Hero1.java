package Extends;

public class Hero1 {
	public String name; //姓名
    
	public   float hp; //血量
	     
	public   float armor; //护甲
	     
	public   int moveSpeed; //移动速度
//	public Hero1(String heroName,float heroHP,float heroArmor,int heroMoveSpeed) {
//		name = heroName;
//		hp = heroHP;
//		armor = heroArmor;
//		moveSpeed = heroMoveSpeed;
//		System.out.println(name+'\n'+hp+'\n'+armor+'\n'+moveSpeed);
//	}
	private Hero1() {
		
	}
	public Hero1(String name,float hp) {
		name=name;
		hp=hp;
	}
	public Hero1(String name,float hp,float armor,int moveSpeed) {
		this(name,hp);
		armor=armor;
		moveSpeed=moveSpeed;
		System.out.println(name+'\n'+hp+'\n'+armor+'\n'+moveSpeed);
	}
	private static Hero1 one=new Hero1();
	private static Hero1 getone() {
		return one;
	}
	public static void main(String[] args) {
		Hero1 a=new Hero1("马超",100,500,600);
	}
}
