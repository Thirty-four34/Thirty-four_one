package File��;

import java.io.File;
import java.io.IOException;

public class creat�ļ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("diary.txt");
		File fi=new File("diaries.txt");
		try {
			f.createNewFile();
			fi.createNewFile();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(fi.getAbsolutePath());
	}

}
