package �Ƴ�ע��;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class �Ƴ�ע�� {
	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Fifty-three\\java\\Thirty-four\\diary.txt");
        removeComments(f);
    }
 
    public static void removeComments(File javaFile) throws IOException {
        FileReader fis =new FileReader(javaFile);
        BufferedReader br = new BufferedReader(fis);
        File fi=new File("C:\\Users\\Fifty-three\\java\\Thirty-four\\diaries.txt");
        FileWriter fw=new FileWriter(fi);
        PrintWriter pw=new PrintWriter(fw);
       
        //��ȫ����ԭ�ļ�
        /***
         * ��Ϊдÿ���ַ�����Ҫ�ӻس��������ÿ��д���ڼӣ���������ж����һ�п���
         * �س�д��ǰ���ͻ���⣬�����������������⣬��һ�л���������
         * ��ô�Ͱѵ�һ�е���д�˵ģ���д������
         *
         * ��������һ�������ע�ͣ���û��������������
         */
        String str =null;
        while ((str = br.readLine()) != null){
            if(str.contains("//")){
                if(!str.trim().startsWith("//")){                  
                	str = str.substring(0,str.indexOf("//"));
                	System.out.println(str);
                    pw.println(str );
                    pw.flush();
                }
            }else {
            	pw.println(str );
            	pw.flush();
            	System.out.println(str);
                }
            
        }
    } 	   
}
