package 集合嵌套;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 叁拾肆
 * @date 2022/11/19 17:20
 **/

/*
集合嵌套形式，Map中嵌套Map集合复杂点，获取的时候，头脑保持清醒状态
    传智播客
        JAVA基础
            001 张三
            002李四
        JAVA就业
            001 王五
            002赵六
学生学号对应姓名，映射键值对，键值对存储到集合中基础学生，存储到基础集合中，就业学生，存储到就业的集合中班级集合，存储传智播客集合中
 */
public class Demo {
    public static void main(String[] args) {
        //创建JAVA基础的集合
        HashMap<String, String> javaDemo1 = new HashMap<String, String>();
        javaDemo1.put("001", "张三");
        javaDemo1.put("002", "李四");
        //创建JAVA就业的集合
        HashMap<String, String> javaDemo2 = new HashMap<String, String>();
        javaDemo2.put("001", "王五");
        javaDemo2.put("002", "赵六");
        //创建传智博客这个集合
        HashMap<String, HashMap<String, String>> java = new HashMap<String, HashMap<String, String>>();
        java.put("JAVA基础", javaDemo1);
        java.put("JAVA就业", javaDemo2);
        Set<String> set=java.keySet();
        Iterator<String> it= set.iterator();
        while (it.hasNext()) {
            String str=it.next();
            HashMap<String, String> hm = java.get(str);
            System.out.println(str);
            Set<String> setDemo1=hm.keySet();
            Iterator<String> itDemo1= setDemo1.iterator();
            while (itDemo1.hasNext()) {
                String strDemo = itDemo1.next();
                String StrDemo = hm.get(strDemo);
                System.out.println("\t\t"+strDemo+"\t"+StrDemo);
            }
        }
    }
}
