package StringBuffer;

public class MyStringBuffer implements IStringBuffer {
	private String Str="abcdefg";
	@Override
	public void append(String str) {
		// TODO �Զ����ɵķ������
		Str+=str;
		System.out.println(Str);
	}

	@Override
	public void append(char c) {
		// TODO �Զ����ɵķ������
		Str+=c;
		System.out.println(Str);
	}

	@Override
	public void insert(int pos, char b) {
		// TODO �Զ����ɵķ������
		Str=Str.substring(0,pos+1)+b+Str.substring(pos+1);
		System.out.println(Str);
	}

	@Override
	public void insert(int pos, String b) {
		// TODO �Զ����ɵķ������
		Str=Str.substring(0,pos+1)+b+Str.substring(pos+1);
		System.out.println(Str);
	}

	@Override
	public void delete(int start) {
		// TODO �Զ����ɵķ������
		Str=Str.substring(0,start);
		System.out.println(Str);
	}

	@Override
	public void delete(int start, int end) {
		// TODO �Զ����ɵķ������
		Str=Str.substring(0,start)+Str.substring(end);
		System.out.println(Str);
	}

	@Override
	public void reverse() {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
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
