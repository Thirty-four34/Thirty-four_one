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
		System.out.println("����ƿ�����"+num+"����p��ͷ�ĵ���");
	}
}
