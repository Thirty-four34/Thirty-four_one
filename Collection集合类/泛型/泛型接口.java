package ����;

/*
 *����ӿڣ�������
 *�����仯��
	1��ʵ����ʵ�ֽӿڲ���᷺��
	�ڴ���ʵ��������ʱ����ָ��������������ԱȽϺã������У����ǲ��������ķ�ʽ
	2��ʵ����ʵ�ֽӿ�ͬʱʵ�ַ���
	ʵ����ʵ�ֽӿ�ʱ�򣬷��;�д���ˣ�����ʵ����Ķ����޷�ָ������
 */

//���һ(ͨ��ʹ�����ַ�ʽ)��
interface MyInter<E>{
	public void show(E e);
}
class MyInterImpl<E> implements MyInter<E>{

	@Override
	public void show(E e) {
		// TODO �Զ����ɵķ������
		System.out.println(e);
	}
	
}
//�������
class MyInterImpl2 implements MyInter<String>{

	@Override
	public void show(String e) {
		// TODO �Զ����ɵķ������
		System.out.println(e);
	}
	
}
public class ���ͽӿ� {
	public static void main(String[] args) {
		MyInter<Integer> mI=new MyInterImpl<Integer>();
		mI.show(342);
		MyInter<Boolean> mi2=new MyInterImpl<Boolean>();
		mi2.show(false);
		
		MyInterImpl2 m=new MyInterImpl2();
		m.show("abcd");//ֻ��ʹ��String����
	}

}
