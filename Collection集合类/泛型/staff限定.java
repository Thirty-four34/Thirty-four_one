package 泛型;

public class staff限定 extends Demo限定 {

	public staff限定(String name, int id, double salary) {
		super(name, id, salary);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void job() {
		// TODO 自动生成的方法存根
		System.out.println(getName()+"..."+getId()+"..."+getSalary()+"..."+"员工");
	}

}
