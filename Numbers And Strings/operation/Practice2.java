package operation;

public class Practice2 {
	public static void main(String[] args) {
		String Str="peter piper picked a peck of pickled peppers";
		String[] S=Str.split(" ");
		int num=0;
		for(int i=0;i<S.length;i++) {
			if(Character.toLowerCase(S[i].charAt(0))=='p') {
				num++;
			}
		}
		System.out.println("这段绕口令有"+num+"个以p开头的单词");
	}
}
