package ����;

//ע�����췽��û�з���
public class ���ͷ���<TT> {
	/*
	 * �ڷ�����(�βε�λ����)���巺�ͣ����͸�������
	 * ���������ʱ�򣬾���ָ����������
	 */
	public void get(TT t) {
		System.out.println(t);
	}
	/*
	 * ��������еķ��ͣ���������࣬�������ֲ��ܺ����ϵķ���ͬ��*�ڷ����������϶��������
	 *�����ڴ��������ʱ��ָ������
	 *���÷�����ʱ�򣬴���ʲô����ʾʲô��������ǰ��������
	 */
	public <E>void set(E e){
		System.out.println(e);		
	}
	public static void main(String[] args) {
		���ͷ���<String> ss=new ���ͷ���<String>();
		ss.get("gd");
		//ss.get(8.7);ʹ��String��������ͻᱨ��
		ss.set(234);
		ss.set(false);
	}
}
