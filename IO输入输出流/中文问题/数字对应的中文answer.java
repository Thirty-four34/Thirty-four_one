package ��������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ���ֶ�Ӧ������answer {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 File f = new File("C:\\���ֶ�Ӧ������.txt");
	        //���������ļ��������  �Զ�����Ŀ¼
	        if (f.exists() == false) 
	            f.getParentFile().mkdirs();

	        try(FileOutputStream fos =new FileOutputStream(f)){
	        	byte[] all = new byte[] {(byte) 0xE5,(byte) 0xB1,(byte) 0x8C};       
	            fos.write(all);
	        } catch (FileNotFoundException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
	        try (InputStreamReader sr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
	             char[] cs = new char[(int) f.length()];
	             sr.read(cs);
	             System.out.printf("InputStreamReader ָ�����뷽ʽUTF-8,ʶ��������ַ��ǣ�%n");
	             System.out.println(new String(cs));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
