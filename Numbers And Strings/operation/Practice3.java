package operation;

public class Practice3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String Str="lengendary";
		System.out.println("变化前：\n"+Str);
		char[] ch=Str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}else {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		Str=new String(ch);
		System.out.println("变化前：\n"+Str);
	}

}
