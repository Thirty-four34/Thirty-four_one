package File��;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File�� {

	public static void main(String[] args) {
		File f=new File("C:\\world.txt");
		//�����ļ����Ѿ����ڵ��ļ������ظ������������ᱨ��
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("�ļ��Ƿ���ڣ�"+f.exists());
		System.out.println("��ȡ�ļ�����"+f.getName());
		System.out.println("��ȡ����·����"+f.getAbsolutePath());
		System.out.println("�Ƿ��������ļ���"+f.isHidden());
		System.out.println("����ļ���С��(��λ���ֽ�)"+f.length());				  
        // ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        f.list();
        // ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        File[]fs= f.listFiles();
        // ���ַ�����ʽ���ػ�ȡ�����ļ���
        System.out.println(f.getParent());
        // ���ļ���ʽ���ػ�ȡ�����ļ���               
        System.out.println(f.getParentFile());	
        // �г����е��̷�c: d: e: �ȵ�
        System.out.println(f.listRoots());         
		//�ļ�����޸�ʱ��
		Date date=new Date(f.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("�ļ�����޸ĵ�ʱ�䣺"+sdf.format(date));
		//System.out.println("ɾ���ļ���"+f.delete());
	}
}
