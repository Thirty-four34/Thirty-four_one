package InnerClass�ڲ���;

public abstract class Hero {
	public abstract void attack(int damage);
    
    public static void main(String[] args) {
 
        //����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal
        final int damage = 5;
         
        Hero h = new Hero(){
            public void attack(int damage) {
                System.out.printf("�µĽ����ֶΣ����%d���˺�",damage );
            }
        };
        h.attack(8);
    }
}
