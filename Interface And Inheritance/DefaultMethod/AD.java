package DefaultMethod;

public interface AD {
	public void physicAttack();
	default public void attack() {
		System.out.println("用物理攻击打死他");
	} 
}
