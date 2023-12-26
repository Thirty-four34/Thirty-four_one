package Polymorphic;

public class Hero {
	public String name; //姓名
    
	public   float hp; //血量
	     
	public   float armor; //护甲
	     
	public   int moveSpeed; //移动速度
	public void kill(Mortal m) {
		System.out.print(this.name);m.die();
	}
	public static void battleWin(){
        System.out.println("hero battle win");
    }
	public static void main(String[] args) {
		Hero GL=new Hero();
		Hero H=new ADHero();
		GL.name = "盖伦";
		System.out.println(GL.toString());
		ADHero AD=new ADHero();
		APHero AP=new APHero();
		ADAPHero ADAP=new ADAPHero();
//		ADHero ad=(ADHero)H;
//		GL.kill(ad);
		GL.kill(AD);
		GL.kill(AP);
		GL.kill(ADAP);
	}
}
