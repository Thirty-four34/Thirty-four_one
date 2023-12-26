package Abstract;

public class LifePotion extends Item {
	
	 public void effect(){
	        System.out.println("血瓶使用后，可以回血");
	    }
	public boolean disposable() {
		this.effect();
		// TODO 自动生成的方法存根
		return true;
	}

}
