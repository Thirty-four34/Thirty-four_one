package Bit;

public class Bit {
public static void main(String[] args) {
	byte i  =5;
    
    System.out.println(Integer.toBinaryString(i)); 
    //5�Ķ�������00000101,����ȡ�Ǽ�Ϊ11111010,��Ϊ-6
   //-6�ڼ�����еĴ洢Ϊ�����Ʋ�����ʽ��Ҳ����˵-6�Ĳ����� 1111 1010
    //���ڿ���̨��Ҫ��ʾ��ֵ��ԭ����ʽ
    //������ж���������ͨ�����ò���������㣬���Խ��зǲ�����õ��Ķ�������ʵ���ǲ��룬Ҫת��Ϊԭ�����ת��Ϊʮ��������
    System.out.println(~i);
}
}
