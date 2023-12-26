package Maths;

public class E {
public static void main(String[] args) {	
	//自然对数e=lim（n趋近无穷大）（1+1/n）^n=1+1/1+(1/(2!))+(1/(3!))+……++(1/(n!))
	 double e = 1.0;  
	    double t = 1.0;  
	    for (int i = 1; i <=40; i++) {  
	      t /= i;  //比如1/3！= （1/2）/3；1/4！= （1/6）/4；
	      e += t;  
	    }  
	System.out.println("计算结果："+e);
	System.out.println("自然数为： "+Math.E);
}
}
