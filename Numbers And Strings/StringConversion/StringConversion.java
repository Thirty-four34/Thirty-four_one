package StringConversion;

public class StringConversion {
	public static void main(String[] args) {
		//把浮点数 3.14 转换为 字符串 "3.14"	
		double d=3.14;
		Double D1=d;
		String Str=String.valueOf(d);
		String Str1=D1.toString();
		//再把字符串 “3.14” 转换为 浮点数 3.14
		System.out.println(Str);
		double D=Double.parseDouble(Str);
		System.out.println(D);
		//如果字符串是 3.1a4，转换为浮点数会得到什么？
//		String S="3.1a4";
//		D=Double.parseDouble(S);
//		System.out.println(D);
		//会转换错误
	}
}
