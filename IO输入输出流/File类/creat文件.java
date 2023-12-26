package File类;

import java.io.File;
import java.io.IOException;

public class creat文件 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("diary.txt");
		File fi=new File("diaries.txt");
		try {
			f.createNewFile();
			fi.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(fi.getAbsolutePath());
	}

}
