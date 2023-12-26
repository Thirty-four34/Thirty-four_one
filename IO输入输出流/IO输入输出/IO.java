package IO输入输出;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("C:\\云边有个小卖部.txt");
		
		
		
		
		
		
		//输出流,如果文件不存在则会自动创建一个。如果文件的父文件不存在则会报错
//		FileOutputStream fos=null;
//		try {	
////当此处添加true时写入的内容以追加的形式添加(在最后一个字节出开始添加)，不写或flase时以覆盖的形式添加
//					fos=new FileOutputStream(f,true);
//		
//			String str="\t生命是有光的。\n"
//					+ "\t在我熄灭以前，能够照亮你一点，就是我所有能做的了。\n"
//					+ "\t我爱你，你要记得我。";
//			byte[] b=str.getBytes();//将字符串转换为字节
//			fos.write(b);//以字节的形式写入			
//		} catch (FileNotFoundException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}finally {
//			if(fos!=null) {
//				try {
//					fos.close();
//				} catch (IOException e) {
//					// TODO 自动生成的 catch 块
//					e.printStackTrace();
//				}
//			}
//		}
		
		
		
		//输入流
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			byte[] b=new byte[(int) f.length()];//数据缓冲区
			fis.read(b);
			System.out.println("读取到的文件内容是：\n"+new String(b));//去空格
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
