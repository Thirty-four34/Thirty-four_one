package Set����;
/*
 *2018699554
  Set����.HashCodeDemo@7852e922
  2018699554��ʮ�����Ƶ���7852e922
  
 *����Ĺ�ϣֵ������ JVM ���ݶ������ڵăȴ棬ͨ���Լ��ײ���㷽���������������һ��ʮ�������������ǹ�ϣֵ����ͨʮ��������
    ��ֵ������һ���ο����ѣ�û���ڴ��κ�����
    
 *��ϣֵ���Ǹ���ͨʮ������������Ŀ�ľ���Ϊ�˹�ϣ�����
    ʹ�ü�ֵ�����еĹ�ϣ��
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		HashCodeDemo HD=new HashCodeDemo();
		System.out.println(HD.hashCode());
		System.out.println(HD);
		
		/*
		 * ��д�˸��෽�� hashCode 
			�Լ����ַ������й�ϣֵ�ļ���
	 		abc �ַ��������Լ��Ĺ�ϣֵ96354
	 		String ���Լ�����ͣ�����0bject�е� hashCode �����޹�
		�ܽ᣺
		ÿ��������һ���������ı�ʾ����ϣֵ����ʵ�ʵĵ�ַû�й�ϵ��ϣֵ�Լ�����
		�Լ�����Ĺ�ϣֵʵ�����壬����ʹ�ü��ϵĹ�ϣ��
		 */
		String s="abc";
		String Str=new String("abc");
		System.out.println(s.hashCode());
		System.out.println(Str.hashCode());
		System.out.println(s==Str);
	}
}
