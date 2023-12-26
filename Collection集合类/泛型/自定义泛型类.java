package 泛型;

import 配件.Student;

public class 自定义泛型类<ST> {//泛型的变量名最好不要用敏感名
	private ST st;
	public void setQ(ST s) {
		this.st=s;
	}
	public ST getT() {
		return this.st;
	}
	public static void main(String[] args) {
		自定义泛型类<Student> ZD=new 自定义泛型类<Student>();
		ZD.setQ(new Student("a",35));
		System.out.println(ZD.getT());
		
		自定义泛型类<Integer> ZD1=new 自定义泛型类<Integer>();
		ZD1.setQ(123);
		System.out.println(ZD1.getT());
	}
}
