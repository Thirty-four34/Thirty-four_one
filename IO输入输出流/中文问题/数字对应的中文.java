package ��������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ���ֶ�Ӧ������ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("C:\\���ֶ�Ӧ������.txt");		
		byte[] b= {(byte)0xE5,(byte)0xB1,(byte)0x8C};
		
		//дʱ������"UTF-8"�ĸ�ʽ��ӡ����
		try(FileOutputStream fos=new FileOutputStream(f)){
			fos.write(b);
			System.out.println(new String(b,"UTF-8"));
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
		//��ʱ������"UTF-8"�ĸ�ʽ��ӡ����
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
