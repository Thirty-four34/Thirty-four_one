package Polymorphic;

public class Hero {
	public String name; //����
    
	public   float hp; //Ѫ��
	     
	public   float armor; //����
	     
	public   int moveSpeed; //�ƶ��ٶ�
	public void kill(Mortal m) {
		System.out.print(this.name);m.die();
	}
	public static void battleWin(){
        System.out.println("hero battle win");
    }
	public static void main(String[] args) {
		Hero GL=new Hero();
		Hero H=new ADHero();
		GL.name = "����";
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
