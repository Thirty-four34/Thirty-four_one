package ����;

import ���.Student;

public class �Զ��巺����<ST> {//���͵ı�������ò�Ҫ��������
	private ST st;
	public void setQ(ST s) {
		this.st=s;
	}
	public ST getT() {
		return this.st;
	}
	public static void main(String[] args) {
		�Զ��巺����<Student> ZD=new �Զ��巺����<Student>();
		ZD.setQ(new Student("a",35));
		System.out.println(ZD.getT());
		
		�Զ��巺����<Integer> ZD1=new �Զ��巺����<Integer>();
		ZD1.setQ(123);
		System.out.println(ZD1.getT());
	}
}
