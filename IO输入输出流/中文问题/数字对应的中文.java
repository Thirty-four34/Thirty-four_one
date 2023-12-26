package 中文问题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class 数字对应的中文 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("C:\\数字对应的中文.txt");		
		byte[] b= {(byte)0xE5,(byte)0xB1,(byte)0x8C};
		
		//写时将其用"UTF-8"的格式打印出来
		try(FileOutputStream fos=new FileOutputStream(f)){
			fos.write(b);
			System.out.println(new String(b,"UTF-8"));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
		//读时将其用"UTF-8"的格式打印出来
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream(f), Charset.forName("UTF-8"))){
			char[] cs = new char[(int) f.length()];
			isr.read(cs);
			System.out.println(new String(cs));
		}catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
