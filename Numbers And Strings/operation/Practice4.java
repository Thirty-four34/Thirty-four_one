package operation;

public class Practice4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String Str="lengendary";
		System.out.println("变化前：\n"+Str);
		char[] ch=Str.toCharArray();
		ch[ch.length-1]=Character.toUpperCase(ch[ch.length-1]);
		Str=new String(ch);
		System.out.println("变化后：\n"+Str);
	}

}
