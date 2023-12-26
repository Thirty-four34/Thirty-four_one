package 泛型;

public class Manager限定 extends Demo限定 {
	 private double bonus;
	 
	public Manager限定(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}

	@Override
	public void job() {
		System.out.println(getName()+"..."+getId()+"..."+getSalary()+"..."+bonus+"经理");

	}

}
