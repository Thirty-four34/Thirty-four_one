package Abstract;

public abstract class Item {
	 String name;
	    int price;
	 
	    public void buy(){
	        System.out.println("����");
	    }
	    public void effect() {
	        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
	    }
	public abstract boolean disposable();
	public static void main(String[] args) {
		Item It=new Item() {
			public boolean disposable() {
				// TODO �Զ����ɵķ������
				System.out.println("�Զ�������");
				return false;
			}
			
		};
		It.disposable();
		System.out.println(It);
	}
}
