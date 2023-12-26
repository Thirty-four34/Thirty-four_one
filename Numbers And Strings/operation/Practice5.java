package operation;

public class Practice5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String Str="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		System.out.println("变化前：\n"+Str);
		int num=Str.lastIndexOf("two");
		System.out.println(num);
		char[] ch=Str.toCharArray();
		ch[num]=Character.toUpperCase(ch[num]);
		Str=new String(ch);
		System.out.println("变化后：\n"+Str);
	}

}
