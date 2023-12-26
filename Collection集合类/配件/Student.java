package 配件;

public class Student implements Comparable<Student> {
	public String name;
	public int age;
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Student"+":"+this.name+"____"+this.age;
	}
	//实现compareTo方法
	public int compareTo(Student o) {
		int num=this.getName().compareTo(o.getName());
		return num==0?this.getAge()-o.getAge():num;
	}
	//重写hashCode
	public int hashCode() {
		int num=this.getName().hashCode()+this.getAge()*321;//乘以321是为了减少出现相同哈希值的误差
		return num;
	}
	//重写后的equals
		public boolean equals(Object o) {
			if(o==null)
				return false;
			if(this==o)
				return true;
			if(o instanceof Student) {
				return ((Student) o).getName()==this.getName() && ((Student) o).getAge()==this.getAge();
			}
			return false;
		}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(1);
	}
	

}
