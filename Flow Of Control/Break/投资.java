package Break;

public class Ͷ�� {
	public static void main(String[] args) {
        
        //��ӡ����    
        for (int j = 1; j < 10000; j++) {
        	float F = (float) (12000* ( Math.pow(1+0.2, j)));
            if(F>=1000000) { 
            System.out.println("��Ҫ"+j+"��");
            System.out.println(F);
                break; //���F����100��ֱ�ӽ���ѭ��
            }
        }
    }
}
