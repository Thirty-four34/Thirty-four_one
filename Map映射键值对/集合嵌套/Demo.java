package ����Ƕ��;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ��ʰ��
 * @date 2022/11/19 17:20
 **/

/*
����Ƕ����ʽ��Map��Ƕ��Map���ϸ��ӵ㣬��ȡ��ʱ��ͷ�Ա�������״̬
    ���ǲ���
        JAVA����
            001 ����
            002����
        JAVA��ҵ
            001 ����
            002����
ѧ��ѧ�Ŷ�Ӧ������ӳ���ֵ�ԣ���ֵ�Դ洢�������л���ѧ�����洢�����������У���ҵѧ�����洢����ҵ�ļ����а༶���ϣ��洢���ǲ��ͼ�����
 */
public class Demo {
    public static void main(String[] args) {
        //����JAVA�����ļ���
        HashMap<String, String> javaDemo1 = new HashMap<String, String>();
        javaDemo1.put("001", "����");
        javaDemo1.put("002", "����");
        //����JAVA��ҵ�ļ���
        HashMap<String, String> javaDemo2 = new HashMap<String, String>();
        javaDemo2.put("001", "����");
        javaDemo2.put("002", "����");
        //�������ǲ����������
        HashMap<String, HashMap<String, String>> java = new HashMap<String, HashMap<String, String>>();
        java.put("JAVA����", javaDemo1);
        java.put("JAVA��ҵ", javaDemo2);
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
