package operation;

public class Practice3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String Str="lengendary";
		System.out.println("�仯ǰ��\n"+Str);
		char[] ch=Str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}else {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		Str=new String(ch);
		System.out.println("�仯ǰ��\n"+Str);
	}

}
