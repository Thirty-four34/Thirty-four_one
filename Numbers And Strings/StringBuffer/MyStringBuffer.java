package StringBuffer;

public class MyStringBuffer implements IStringBuffer {
	private String Str="abcdefg";
	@Override
	public void append(String str) {
		// TODO 自动生成的方法存根
		Str+=str;
		System.out.println(Str);
	}

	@Override
	public void append(char c) {
		// TODO 自动生成的方法存根
		Str+=c;
		System.out.println(Str);
	}

	@Override
	public void insert(int pos, char b) {
		// TODO 自动生成的方法存根
		Str=Str.substring(0,pos+1)+b+Str.substring(pos+1);
		System.out.println(Str);
	}

	@Override
	public void insert(int pos, String b) {
		// TODO 自动生成的方法存根
		Str=Str.substring(0,pos+1)+b+Str.substring(pos+1);
		System.out.println(Str);
	}

	@Override
	public void delete(int start) {
		// TODO 自动生成的方法存根
		Str=Str.substring(0,start);
		System.out.println(Str);
	}

	@Override
	public void delete(int start, int end) {
		// TODO 自动生成的方法存根
		Str=Str.substring(0,start)+Str.substring(end);
		System.out.println(Str);
	}

	@Override
	public void reverse() {
		// TODO 自动生成的方法存根
		char[] ch=Str.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char c=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=c;
		}
		Str=new String(ch);
		System.out.println(Str);
	}

	@Override
	public int length() {
		// TODO 自动生成的方法存根
		System.out.println(Str.length());
		return Str.length();
		
	}
	public static void main(String[] args) {
		MyStringBuffer MSB=new MyStringBuffer();
		MSB.append('R');
		MSB.append("MN");
		MSB.insert(3, 'Z');
		MSB.insert(3, "XV");
		MSB.delete(6);
		MSB.delete(3,5);
		MSB.reverse();
		MSB.length();
	}
}
