package DefaultMethod;

public class Hero {
	public String name; //����
    
	public   float hp; //Ѫ��
	     
	public   float armor; //����
	     
	public   int moveSpeed; //�ƶ��ٶ�
	public static void main(String[] args) {
		Hero h=new ADAPHero();
		h.attack();
		AD ADAP=new ADAPHero();
		ADAP.attack();
	}
	private void attack() {
		// TODO �Զ����ɵķ������
		System.out.println("---");
	}
}
