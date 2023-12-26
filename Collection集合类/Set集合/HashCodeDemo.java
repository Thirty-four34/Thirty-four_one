package Set集合;
/*
 *2018699554
  Set集合.HashCodeDemo@7852e922
  2018699554的十六进制等于7852e922
  
 *对象的哈希值，就是 JVM 根据对象所在的內存，通过自己底层计算方法给这个对象计算出一个十进制数，数就是哈希值（普通十进制数）
    数值，程序一个参考而已，没有内存任何因素
    
 *哈希值就是个普通十进制数，出现目的就是为了哈希表而来
    使用价值集合中的哈希表
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		HashCodeDemo HD=new HashCodeDemo();
		System.out.println(HD.hashCode());
		System.out.println(HD);
		
		/*
		 * 重写了父类方法 hashCode 
			自己对字符串进行哈希值的计算
	 		abc 字符串对象自己的哈希值96354
	 		String 类自己计算和，父类0bject中的 hashCode 方法无关
		总结：
		每个对象都有一个进制数的表示，哈希值，和实际的地址没有关系哈希值自己计算
		自己计算的哈希值实际意义，在于使用集合的哈希表
		 */
		String s="abc";
		String Str=new String("abc");
		System.out.println(s.hashCode());
		System.out.println(Str.hashCode());
		System.out.println(s==Str);
	}
}
