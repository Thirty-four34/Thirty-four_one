package Abstract;

public class LifePotion extends Item {
	
	 public void effect(){
	        System.out.println("Ѫƿʹ�ú󣬿��Ի�Ѫ");
	    }
	public boolean disposable() {
		this.effect();
		// TODO �Զ����ɵķ������
		return true;
	}

}
