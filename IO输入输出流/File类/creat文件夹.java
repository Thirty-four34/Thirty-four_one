package File��;

import java.io.File;

public class creat�ļ��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("C:\\sss\\ss\\s");
		f.mkdir();//�����ļ��У�һ�δ���һ����ֻ������s�ļ���
		f.mkdirs();//�����ļ��м������ļ��У�����s�ļ��е�ͬʱ���丸�ļ���(sss��ss)��㴴��
		f.delete();//ɾ���������һ���ļ���s
		//��ȡ�ļ��е����ļ���
		File F=new File("C:\\");//��ȡc���ļ���
		//����һ��list()����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��		
		String[] S=F.list();
		for(String str:S) {
			System.out.println(str);
		}
		System.out.println("-------------------------------------------------");
		//��������listFiles()����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
		File Fi[]=F.listFiles();//���������ʽ��ȡc���ļ��е���
		for(File fi:Fi) {
			if(fi.isFile()) {
				System.out.println("�ļ���"+fi.getName());
			}else if(fi.isDirectory()) {
				System.out.println("�ļ��У�"+fi.getName());
			}
		}
		
	}

}
