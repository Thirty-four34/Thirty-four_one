package PackingAndUnpacking;

public class Number {
	public static void main(String[] args) {
		
		byte b=2;
	short s=4;
	float f=7;
	double d=19;
	int j=90;
	//�Զ�װ��
	Byte B=b;
	Short S=s;
	Float F=f;
	Double D=d;
	//�Զ�����
	byte by=B;
	short sh=S;
	double d0=D;
	// byte��Integer֮���ܷ�����Զ�������Զ�װ��
	int i=B;//С�Ŀ��ԷŽ����
	Byte BY=(byte) j;//��Ҫǿ��ת��
	Integer I=(int) b; //��ķŽ�С�ģ���Ҫǿ��ת��
	System.out.println(BY);
	//ͨ��Byte��ȡbyte�����ֵ
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	}	
}
