package Properties类;



import java.util.Properties;

/*
Properties类，继承Hashtable，实现Map接口
操作Map接口存储和职出，Properties完全一样
线程安全的
    没有指定泛型，在类定义时候
    此类和IO流结合使用，实现数据的持久存储
不是没有泛型，泛型固定为String
    可以使用Map的put方法存储对象
    get方法获取值
有2个自己特有的方法，必须会用
    setproperty(String key,String value) == put
    getProperty(String key) == get
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pp=new Properties();
        System.out.println(pp);
        pp.setProperty("name","叁拾肆");
        pp.setProperty("age","34");
        System.out.println(pp);
        System.out.println(pp.getProperty("name"));
    }
}
