package ����ת����;

import java.util.*;

/**
 * @author ��ʰ��
 * @date 2022/11/19 19:13
 **/
/*
����ת�ɼ���
    Arrays�ྲ̬���� asList�������ɼ��ϣ��̶�����,ת���ɵļ���ֻ���޸Ĳ�����ɾ
    ����ת���� toArray()->Collection�ӿ�
ע���������͵����鲻��ת��Ϊ���ϣ���Ϊ���ϲ��洢��������
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] str = {"a", "jkdhfa", "sdfjks", "iet", "39048", "ifa"};
        List<String> al = Arrays.asList(str);
        //�޸�ֵ
        al.set(1, "��ʰ��");
        System.out.println(al);

        //����ת����
        String[] s=al.toArray(new String[0]);
        for (String st : s) {
            System.out.print(st+" ");
        }
        System.out.println();

        //��������ת��Ϊ���ϻ���ֲ�����Ĵ���(�õ���Ԫ��������Ĺ�ϣֵ)
        int[] num = {4, 5, 2, 8, 54, 76, 234};
        List li = Arrays.asList(num);
        System.out.println(li);
        System.out.println(li.size());
    }
}
