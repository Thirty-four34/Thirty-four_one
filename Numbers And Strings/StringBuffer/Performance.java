package StringBuffer;

import java.util.Random;

public class Performance {
		public static void main(String[] args) {
			// TODO �Զ����ɵķ������
//����һ��
			System.out.println("-------------����һ----------��");
			String Str="asdfghjklz";
			StringBuffer Sb=new StringBuffer(Str);
			String S="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random Ran=new Random();
		char ch='r';
			long a=System.currentTimeMillis();
				for(int i=0;i<100000;i++)				
					Str+=ch;			
				long b=System.currentTimeMillis();
				System.out.println(b-a);
		
			long a1=System.currentTimeMillis();
			for(int i=0;i<1000000;i++)				
				Sb.append(ch);						
			long b1=System.currentTimeMillis();
			System.out.println(b1-a1);
			
			
//��������
			System.out.println("-------------������----------��");
			 String str1 = " ";
			 long start=System.currentTimeMillis();
			for(int i=0;i<10000;i++) {    	   
	    	   str1+=rand(10);
	       }
	      long end=System.currentTimeMillis();
	       System.out.println("��ʱ"+(end-start)+"����");
	       
	       StringBuffer SB=new StringBuffer("");
	       start=System.currentTimeMillis();
	       for(int i=0;i<10000;i++) {    	
	    	   SB.append(rand(10));
	       }
	       end=System.currentTimeMillis();
	       System.out.println("��ʱ"+(end-start)+"����");       
		}
			public static String rand(int num) {
				String Str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random ran=new Random();
				String Str1="";
				for(int i=0;i<num;i++) {
					int nums=ran.nextInt(Str.length());
					Str1+=String.valueOf(Str.charAt(num));
				}
		    	   return Str1;
		}
}
