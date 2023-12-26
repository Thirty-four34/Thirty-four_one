package Extends;

public class Item {
    String name;
    int price;
    public String toString() {
		return name+price;
    	
    }
    public void finalize() {
    	System.out.println("当前对象正在被回收");
    }
    public boolean equals(Object o) {
    	if(o instanceof Item) {
    		Item It=(Item) o;
    		return this.price == It.price;
    	}
    	return false;
    }
    public static void main(String[] args) {
		Item It=null;
		for(int i=0;i<2000000;i++) {
			It=new Item();
		}
		It.toString();
		It.price=3000;
		Item TE=new Item();
		TE.price=800;
		System.out.println(It.equals(TE));
	}
}
