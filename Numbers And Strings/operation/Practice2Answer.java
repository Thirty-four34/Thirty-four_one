package operation;

public class Practice2Answer {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 String s = "peter piper picked a peck of pickled peppers";
	         String [] s1 = s.split(" ");
	         int count = 0;
	         for(String each:s1){
	             if(each.substring(0,1).equals("p"))count++;
	         }
	         System.out.println("һ����" + count + "��p��ͷ��");
	}

}
