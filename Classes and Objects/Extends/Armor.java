package Extends;

public class Armor extends Item {
	int ac;
	public static void main(String[] args) {
		Armor one= new Armor();
		Armor two= new Armor();		
		System.out.println((one.name="²¼¼×")+" "+(one.price=300)+" "+(one.ac=15));
		System.out.println((two.name="Ëø×Ó¼×")+" "+(two.price=500)+" "+(two.ac=40));
	}
}
