package DefaultMethod;

public class Hero {
	public String name; //姓名
    
	public   float hp; //血量
	     
	public   float armor; //护甲
	     
	public   int moveSpeed; //移动速度
	public static void main(String[] args) {
		Hero h=new ADAPHero();
		h.attack();
		AD ADAP=new ADAPHero();
		ADAP.attack();
	}
	private void attack() {
		// TODO 自动生成的方法存根
		System.out.println("---");
	}
}
