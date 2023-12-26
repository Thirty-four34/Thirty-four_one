package 中文问题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class 数字对应的中文answer {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 File f = new File("C:\\数字对应的中文.txt");
	        //创建基于文件的输出流  自动创建目录
	        if (f.exists() == false) 
	            f.getParentFile().mkdirs();

	        try(FileOutputStream fos =new FileOutputStream(f)){
	        	byte[] all = new byte[] {(byte) 0xE5,(byte) 0xB1,(byte) 0x8C};       
	            fos.write(all);
	        } catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
	        try (InputStreamReader sr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
	             char[] cs = new char[(int) f.length()];
	             sr.read(cs);
	             System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
	             System.out.println(new String(cs));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
