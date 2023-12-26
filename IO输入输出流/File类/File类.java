package File类;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File类 {

	public static void main(String[] args) {
		File f=new File("C:\\world.txt");
		//创建文件，已经存在的文件不能重复创建否则程序会报错
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("文件是否存在："+f.exists());
		System.out.println("获取文件名："+f.getName());
		System.out.println("获取绝对路径："+f.getAbsolutePath());
		System.out.println("是否是隐藏文件："+f.isHidden());
		System.out.println("输出文件大小：(单位：字节)"+f.length());				  
        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f.list();
        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[]fs= f.listFiles();
        // 以字符串形式返回获取所在文件夹
        System.out.println(f.getParent());
        // 以文件形式返回获取所在文件夹               
        System.out.println(f.getParentFile());	
        // 列出所有的盘符c: d: e: 等等
        System.out.println(f.listRoots());         
		//文件最后修改时间
		Date date=new Date(f.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("文件最后修改的时间："+sdf.format(date));
		//System.out.println("删除文件："+f.delete());
	}
}
