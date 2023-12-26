package Abstract;

public abstract class Item {
	 String name;
	    int price;
	 
	    public void buy(){
	        System.out.println("购买");
	    }
	    public void effect() {
	        System.out.println("物品使用后，可以有效果");
	    }
	public abstract boolean disposable();
	public static void main(String[] args) {
		Item It=new Item() {
			public boolean disposable() {
				// TODO 自动生成的方法存根
				System.out.println("自动生成类");
				return false;
			}
			
		};
		It.disposable();
		System.out.println(It);
	}
}
