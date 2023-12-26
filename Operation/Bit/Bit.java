package Bit;

public class Bit {
public static void main(String[] args) {
	byte i  =5;
    
    System.out.println(Integer.toBinaryString(i)); 
    //5的二进制是00000101,所以取非即为11111010,即为-6
   //-6在计算机中的存储为二进制补码形式，也就是说-6的补码是 1111 1010
    //而在控制台上要显示数值的原码形式
    //计算机中二进制运算通常采用补码进行运算，所以进行非操作后得到的二进制其实就是补码，要转换为原码后再转化为十进制数。
    System.out.println(~i);
}
}
