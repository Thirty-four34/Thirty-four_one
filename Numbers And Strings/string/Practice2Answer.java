package string;

import java.util.Arrays;
import java.util.Random;

public class Practice2Answer {
	public static void main(String[] args) {
		  //�����ַ���������д�ˣ�ֱ��ճ��
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand=new Random();
        String[] ss = new String[8];
        for (int i = 0;i<ss.length;i++){
            char[] s = new char[5];
            for (int j = 0;j<s.length;j++){
                int num= rand.nextInt(str.length());
                s[j] = str.charAt(num);
//                System.out.print(s[j]);
            }
            String somestr = new String(s);
            ss[i] = somestr;
        }
        System.out.println("����ǰ");
        System.out.println(Arrays.toString(ss));
        System.out.println("�����");
        sortSomeStr(ss);
        System.out.println(Arrays.toString(ss));
    }
    static void sortSomeStr(String[] arr) {
    	for(int i=0;i<arr.length;i++) {
			for(int k=i;k<arr.length;k++) {
                if ((int) Character.toLowerCase(arr[i].charAt(0)) >
                        (int) Character.toLowerCase(arr[k].charAt(0))) {
                    //����һ���м�ֵ:
                    String temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
	}
}
