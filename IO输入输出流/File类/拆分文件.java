package File��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ����ļ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("C:\\sss\\ss\\eclipse.exe");
		if(f.length() == 0) {
            System.out.println("���ļ������ڣ������˳���");
            System.exit(0);
        }
		//����˼·���Ȱ�eclipse.exe�����ݶ���������data��Ȼ��ͨ����data�ָ��co��
//		�ٰ�coͨ�������д��eclipse.exe-i
		int size=100*1024;
		
		//��ȡ����
		byte data[]=new byte[(int)f.length()];
		byte co[]=new byte[size];
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			fis.read(data);			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
		//д������
		int num=(int)f.length()/size+1;
		for(int i=0;i<num;i++) {
			String name="eclipse.exe-"+i;
			if(i+1!=num) {
				co=Arrays.copyOfRange(data, i*size,(i+1)*size);
			}else {
				co=Arrays.copyOfRange(data, i*size,(int)f.length());
			}
			File fi=new File(f.getParent(),name);
			FileOutputStream fos=null;
			try {
				fos=new FileOutputStream(fi);
				fos.write(co);
				System.out.println(fi.getParent() + " " +fi.getName()+ " " +fi.length() + " " + "bytes.");
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}finally {
				if(fos!=null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}
	}

}
