package operation;

public class Practice5Answer {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 String s = "Nature has given us that "+
         "two ears, "+
         "two eyes, and but one tongue, to the end that we should hear and see more than we speak";
         int T=s.lastIndexOf("two");
         System.out.println("ԭ��:"+s);
         System.out.println("�¾�:"+s.substring(0,T)+s.substring(T,T+1).toUpperCase()+s.substring(T+1));
	}

}
