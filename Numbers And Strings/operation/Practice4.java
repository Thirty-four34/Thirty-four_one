package operation;

public class Practice4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String Str="lengendary";
		System.out.println("�仯ǰ��\n"+Str);
		char[] ch=Str.toCharArray();
		ch[ch.length-1]=Character.toUpperCase(ch[ch.length-1]);
		Str=new String(ch);
		System.out.println("�仯��\n"+Str);
	}

}
