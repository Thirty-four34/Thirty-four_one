package Properties��;



import java.util.Properties;

/*
Properties�࣬�̳�Hashtable��ʵ��Map�ӿ�
����Map�ӿڴ洢��ְ����Properties��ȫһ��
�̰߳�ȫ��
    û��ָ�����ͣ����ඨ��ʱ��
    �����IO�����ʹ�ã�ʵ�����ݵĳ־ô洢
����û�з��ͣ����͹̶�ΪString
    ����ʹ��Map��put�����洢����
    get������ȡֵ
��2���Լ����еķ������������
    setproperty(String key,String value) == put
    getProperty(String key) == get
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pp=new Properties();
        System.out.println(pp);
        pp.setProperty("name","��ʰ��");
        pp.setProperty("age","34");
        System.out.println(pp);
        System.out.println(pp.getProperty("name"));
    }
}
