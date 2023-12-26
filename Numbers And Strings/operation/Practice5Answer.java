package operation;

public class Practice5Answer {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 String s = "Nature has given us that "+
         "two ears, "+
         "two eyes, and but one tongue, to the end that we should hear and see more than we speak";
         int T=s.lastIndexOf("two");
         System.out.println("原句:"+s);
         System.out.println("新句:"+s.substring(0,T)+s.substring(T,T+1).toUpperCase()+s.substring(T+1));
	}

}
