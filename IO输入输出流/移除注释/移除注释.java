package 移除注释;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 移除注释 {
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
       
        //完全复制原文件
        /***
         * 因为写每行字符串需要加回车，如果在每行写完在加，会在最后行多出来一行空行
         * 回车写在前，就会避免，不过会出现另外的问题，第一行会多出来空行
         * 那么就把第一行单独写了的，再写后面行
         *
         * ！！！第一行如果有注释，我没有做处理！！！！
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
