package Repeat;

import Extends.Hero;

public class Treatment extends Hero {
	private void heal() {
		
			}
	private void heal(Hero h) {
		System.out.println(name+"Ϊ"+h.name+"�ṩ������");
		}
	private void heal(Hero...heros) {
		for(int i=0;i<heros.length;i++) {
		System.out.println(name+"Ϊ"+heros[i].name+"�ṩ������");
		}
	}
	public static void main(String[] args) {
		Treatment Tr=new Treatment();
		Hero a=new Hero();
		Hero b=new Hero();
		Tr.name="���ļ�";
		a.name="����";
		b.name="����";
		Tr.heal(b);
		Tr.heal(a,b);
	}
}
