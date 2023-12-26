package Practice;

public class 小学算术题 {
	public static void main(String[] args) {
		int a,b,c,d;
		for(a=0;a<9;a++) {
			for(b=0;b<9;b++) {
				for(d=0;d<11;d++) {
					for(c=0;c<15;c++) {
					if(a+b==8&a+c==14&b+d==10&c-d==6) {
						System.out.println(a+" "+b+" "+c+" "+d);
						}
					}
				}
			}
		}
	}
}
