import Interface.Support;

public   class Hero{	  
	 public void attack() {
	}
     	 static int damage = 5;
	    public static void main(String[] args) {
	 
	        //����������ʹ���ⲿ�ľֲ�����damage ��������Ϊfinal
	        
	         
	        //����ʹ�ñ�����AnonymousHero��ģ����������������Ի���
	         
	        //��ʵ�ϵ������࣬����������������һ��damage���ԣ�����ʹ�ù��췽����ʼ�������Ե�ֵ
	        //��attack��ʹ�õ�damage������ʹ�õ�������ڲ�damage�������ⲿdamage
	         
	        //�����ⲿ���Բ���Ҫ����Ϊfinal
	        //��ô��attack���޸�damage��ֵ���ͻᱻ��ʾΪ�޸����ⲿ����damage��ֵ
	         
	        //�����������ǲ�ͬ�ı������ǲ������޸��ⲿ����damage��
	        //����Ϊ�˱�������󵼣��ⲿ��damage��������Ϊfinal,"����ȥ"�Ͳ����޸���
	        class AnonymousHero extends Hero{
	            int damage;
	            public AnonymousHero(int damage){
	                this.damage = damage;
	            }
	            public void attack() {
	                damage = 10;
	                System.out.printf("�µĽ����ֶΣ����%d���˺�",this.damage );
	            }
	        }
	         
	        Hero h = new AnonymousHero(damage);
	        h.attack();
	        Hero h1 = new Hero();
			System.out.println();
	        System.out.println(h1.damage);
	    }
}
