package PackingAndUnpacking;

public class Number {
	public static void main(String[] args) {
		
		byte b=2;
	short s=4;
	float f=7;
	double d=19;
	int j=90;
	//自动装箱
	Byte B=b;
	Short S=s;
	Float F=f;
	Double D=d;
	//自动拆箱
	byte by=B;
	short sh=S;
	double d0=D;
	// byte和Integer之间能否进行自动拆箱和自动装箱
	int i=B;//小的可以放进大的
	Byte BY=(byte) j;//需要强制转换
	Integer I=(int) b; //大的放进小的，需要强制转换
	System.out.println(BY);
	//通过Byte获取byte的最大值
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	}	
}
