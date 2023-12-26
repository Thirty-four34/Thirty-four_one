package operation;

public class Practice1 {
	public static void main(String[] args) {
		String Str="let there be light";
		System.out.println("变化前：\n"+Str);
		System.out.println("变化后：");
		String[] S=Str.split(" ");
		char ch[][]=new char[S.length][];
		for(int i=0;i<ch.length;i++) {
			ch[i]=S[i].toCharArray();
			ch[i][0]=Character.toUpperCase(ch[i][0]);
			S[i]=new String(ch[i]);
			System.out.print(S[i]+" ");
		}
		
//	char[] ch=Str.toCharArray();
//		for(int i=0;i<ch.length;i++){
//			if(i==0|i==4|i==10|i==13) {
//				ch[i]=Character.toUpperCase(ch[i]);
//			}
//		}
//		Str=new String(ch);
//		System.out.println("变化后：");
//		System.out.println(Str);
	}
	
}
