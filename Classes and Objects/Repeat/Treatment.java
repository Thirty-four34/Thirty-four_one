package Repeat;

import Extends.Hero;

public class Treatment extends Hero {
	private void heal() {
		
			}
	private void heal(Hero h) {
		System.out.println(name+"为"+h.name+"提供了治疗");
		}
	private void heal(Hero...heros) {
		for(int i=0;i<heros.length;i++) {
		System.out.println(name+"为"+heros[i].name+"提供了治疗");
		}
	}
	public static void main(String[] args) {
		Treatment Tr=new Treatment();
		Hero a=new Hero();
		Hero b=new Hero();
		Tr.name="蔡文姬";
		a.name="韩信";
		b.name="赵兴";
		Tr.heal(b);
		Tr.heal(a,b);
	}
}
