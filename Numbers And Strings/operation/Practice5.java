package operation;

public class Practice5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		String Str="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		System.out.println("�仯ǰ��\n"+Str);
		int num=Str.lastIndexOf("two");
		System.out.println(num);
		char[] ch=Str.toCharArray();
		ch[num]=Character.toUpperCase(ch[num]);
		Str=new String(ch);
		System.out.println("�仯��\n"+Str);
	}

}
