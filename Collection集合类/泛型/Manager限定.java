package ����;

public class Manager�޶� extends Demo�޶� {
	 private double bonus;
	 
	public Manager�޶�(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}

	@Override
	public void job() {
		System.out.println(getName()+"..."+getId()+"..."+getSalary()+"..."+bonus+"����");

	}

}
