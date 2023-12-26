
public class ADHero extends Hero implements Mortal{

	
	 public void physicAttack() {
	        System.out.println("进行物理攻击");
	    }
//	 public ADHero(){
//	      
//	    }
	    public ADHero(String name){
//	        super(name);
	        System.out.println("AD Hero的构造方法");
	    }
	     @Override
		public void die() {
			// TODO 自动生成的方法存根
			
		}
	     //隐藏父类的battleWin方法
	     public static void battleWin(){
	         System.out.println("ad hero battle win");
	     } 
	     public void fo() {
	     	System.out.println("fsdlfk");
	     }
	    public static void main(String[] args) {
	        Hero H=new ADHero("叁拾肆");
//	        System.out.println(H.name);
	    }

		
	
}
