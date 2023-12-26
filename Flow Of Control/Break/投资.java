package Break;

public class 投资 {
	public static void main(String[] args) {
        
        //打印单数    
        for (int j = 1; j < 10000; j++) {
        	float F = (float) (12000* ( Math.pow(1+0.2, j)));
            if(F>=1000000) { 
            System.out.println("需要"+j+"年");
            System.out.println(F);
                break; //如果F大于100万，直接结束循环
            }
        }
    }
}
