package operation;

public class Practice3Answer {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  String s = "lengendary ";
         char [] chs = s.toCharArray();
         for(int i = 0; i < chs.length; i+=2)chs[i] = Character.toUpperCase(chs[i]);
         System.out.print(chs);
	}

}
