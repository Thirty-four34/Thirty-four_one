package File��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class �ϲ��ļ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File fi=new File("C:\\sss\\ss\\sps.exe");
		
		for(int i=0;i<4;i++) {
			String name="eclipse.exe-"+i;
			File f=new File("C:\\sss\\ss\\",name);
			byte data[]=null;
			try(FileInputStream fis=new FileInputStream(f))	{
				data=new byte[(int) f.length()];
				fis.read(data);	
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			try(FileOutputStream fos=new FileOutputStream(fi,true)){				
				fos.write(data);
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
