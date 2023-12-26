package File类;

import java.io.File;

public class creat文件夹 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("C:\\sss\\ss\\s");
		f.mkdir();//创建文件夹，一次创建一个，只创建了s文件夹
		f.mkdirs();//创建文件夹及其子文件夹，创建s文件夹的同时将其父文件夹(sss和ss)随便创建
		f.delete();//删除的是最后一个文件夹s
		//获取文件夹的子文件夹
		File F=new File("C:\\");//获取c盘文件夹
		//方法一：list()返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。		
		String[] S=F.list();
		for(String str:S) {
			System.out.println(str);
		}
		System.out.println("-------------------------------------------------");
		//方法二：listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
		File Fi[]=F.listFiles();//以数组的形式获取c盘文件夹的子
		for(File fi:Fi) {
			if(fi.isFile()) {
				System.out.println("文件："+fi.getName());
			}else if(fi.isDirectory()) {
				System.out.println("文件夹："+fi.getName());
			}
		}
		
	}

}
