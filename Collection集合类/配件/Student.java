package ���;

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
	//ʵ��compareTo����
	public int compareTo(Student o) {
		int num=this.getName().compareTo(o.getName());
		return num==0?this.getAge()-o.getAge():num;
	}
	//��дhashCode
	public int hashCode() {
		int num=this.getName().hashCode()+this.getAge()*321;//����321��Ϊ�˼��ٳ�����ͬ��ϣֵ�����
		return num;
	}
	//��д���equals
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
		// TODO �Զ����ɵķ������
		System.out.println(1);
	}
	

}
