package Maths;

public class E {
public static void main(String[] args) {	
	//��Ȼ����e=lim��n��������󣩣�1+1/n��^n=1+1/1+(1/(2!))+(1/(3!))+����++(1/(n!))
	 double e = 1.0;  
	    double t = 1.0;  
	    for (int i = 1; i <=40; i++) {  
	      t /= i;  //����1/3��= ��1/2��/3��1/4��= ��1/6��/4��
	      e += t;  
	    }  
	System.out.println("��������"+e);
	System.out.println("��Ȼ��Ϊ�� "+Math.E);
}
}
