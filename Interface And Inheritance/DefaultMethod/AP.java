package DefaultMethod;

public interface AP {
	public void magicAttack();
	default public void attack1() {
		System.out.println("用魔法攻击打死他");
	} 
}
