package IO�������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("C:\\�Ʊ��и�С����.txt");
		
		
		
		
		
		
		//�����,����ļ�����������Զ�����һ��������ļ��ĸ��ļ���������ᱨ��
//		FileOutputStream fos=null;
//		try {	
////���˴����trueʱд���������׷�ӵ���ʽ���(�����һ���ֽڳ���ʼ���)����д��flaseʱ�Ը��ǵ���ʽ���
//					fos=new FileOutputStream(f,true);
//		
//			String str="\t�������й�ġ�\n"
//					+ "\t����Ϩ����ǰ���ܹ�������һ�㣬�����������������ˡ�\n"
//					+ "\t�Ұ��㣬��Ҫ�ǵ��ҡ�";
//			byte[] b=str.getBytes();//���ַ���ת��Ϊ�ֽ�
//			fos.write(b);//���ֽڵ���ʽд��			
//		} catch (FileNotFoundException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}finally {
//			if(fos!=null) {
//				try {
//					fos.close();
//				} catch (IOException e) {
//					// TODO �Զ����ɵ� catch ��
//					e.printStackTrace();
//				}
//			}
//		}
		
		
		
		//������
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			byte[] b=new byte[(int) f.length()];//���ݻ�����
			fis.read(b);
			System.out.println("��ȡ�����ļ������ǣ�\n"+new String(b));//ȥ�ո�
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
		
	}

}
