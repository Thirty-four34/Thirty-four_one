package Enumeration;

public class Enumeration {
	public static void main(String[] args) {
		for(HeroType En:HeroType.values()) {
			switch(En) {
			case TANK:
				System.out.println("???");
				break;
			case ASSASSIN:
				System.out.println("???");
				break;
			case ASSIST:
				System.out.println("????");
				break;
			case FARMING:
				System.out.println("???");
				break;
			case PUSH:
				System.out.println("???");
				break;
			case RANGED:
				System.out.println("???");
				break;
			case WARRIOR:
				System.out.println("???");
				break;
			case WIZARD:
				System.out.println("???");
				break;
			}
		}
	}	
}
