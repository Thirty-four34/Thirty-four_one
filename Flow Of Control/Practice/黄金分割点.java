package Practice;

public class 黄金分割点 {
	public static void main(String[] args) {
		double cha=0;
        double m=0;
        double n=0;
        double mindiffer=0.618;
        int a=0;
        int b=0;
        for(int i=1;i<=20;i++){
            for(int j=1;j<=20;j++){
                if((i%2==0)&&(j%2==0)){
                    continue;
                }
                else{
                    n=(double)i/j;
                    double differ=n-0.618;
                    cha=Math.abs(differ);
                    if(cha<mindiffer){
                        mindiffer=cha;
                        a=i;
                        b=j;  
                    }
                }    
            }
        }System.out.println("分数:"+a+"/"+b);
	}
}
