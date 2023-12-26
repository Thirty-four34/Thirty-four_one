package File类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class 拆分文件 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("C:\\sss\\ss\\eclipse.exe");
		if(f.length() == 0) {
            System.out.println("该文件不存在，程序退出！");
            System.exit(0);
        }
		//大致思路是先把eclipse.exe的数据读出来存入data，然后通过将data分割成co，
//		再把co通过输出流写进eclipse.exe-i
		int size=100*1024;
		
		//读取数据
		byte data[]=new byte[(int)f.length()];
		byte co[]=new byte[size];
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			fis.read(data);			
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
		
		
		//写入数据
		int num=(int)f.length()/size+1;
		for(int i=0;i<num;i++) {
			String name="eclipse.exe-"+i;
			if(i+1!=num) {
				co=Arrays.copyOfRange(data, i*size,(i+1)*size);
			}else {
				co=Arrays.copyOfRange(data, i*size,(int)f.length());
			}
			File fi=new File(f.getParent(),name);
			FileOutputStream fos=null;
			try {
				fos=new FileOutputStream(fi);
				fos.write(co);
				System.out.println(fi.getParent() + " " +fi.getName()+ " " +fi.length() + " " + "bytes.");
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}finally {
				if(fos!=null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}
	}

}
