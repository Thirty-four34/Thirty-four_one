package File类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class 合并文件 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File fi=new File("C:\\sss\\ss\\sps.exe");
		
		for(int i=0;i<4;i++) {
			String name="eclipse.exe-"+i;
			File f=new File("C:\\sss\\ss\\",name);
			byte data[]=null;
			try(FileInputStream fis=new FileInputStream(f))	{
				data=new byte[(int) f.length()];
				fis.read(data);	
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try(FileOutputStream fos=new FileOutputStream(fi,true)){				
				fos.write(data);
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
