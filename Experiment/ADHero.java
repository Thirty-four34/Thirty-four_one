
public class ADHero extends Hero implements Mortal{

	
	 public void physicAttack() {
	        System.out.println("����������");
	    }
//	 public ADHero(){
//	      
//	    }
	    public ADHero(String name){
//	        super(name);
	        System.out.println("AD Hero�Ĺ��췽��");
	    }
	     @Override
		public void die() {
			// TODO �Զ����ɵķ������
			
		}
	     //���ظ����battleWin����
	     public static void battleWin(){
	         System.out.println("ad hero battle win");
	     } 
	     public void fo() {
	     	System.out.println("fsdlfk");
	     }
	    public static void main(String[] args) {
	        Hero H=new ADHero("��ʰ��");
//	        System.out.println(H.name);
	    }

		
	
}
