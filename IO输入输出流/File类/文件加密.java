package File类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class 文件加密 {
	static byte b[]=null;
	public static void encodeFile(File original, File encryption) {
		//以字节流的形式读取文件内容，方便后面的操作
		try(FileInputStream fis=new FileInputStream(original)){
			b=new byte[(int)original.length()];
			fis.read(b);
			//因为目标文件是"UTF-8"格式，所以要用"UTF-8"的格式打印，否则中文会出现
			System.out.println("加密前的内容：\n"+new String(b,"UTF-8"));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//开始对文件进行加密
		for(int i=0;i<b.length;i++) {
			if(64<b[i] & b[i]<91) {
				if(b[i]==90) {
					b[i]=65;
				}else {
					b[i]=(byte) (b[i]+1);
					}
			}
			else if(47<b[i] & b[i]<58) {
				if(b[i]==57) {
					b[i]=48;
				}else {
					b[i]=(byte) (b[i]+1);
					}
			}
			else if(96<b[i] & b[i]<123) {
				if(b[i]==122) {
					b[i]=97;
				}else {
				b[i]=(byte) (b[i]+1);
				}
			}
		}
		//将加密的数据转换为字符串，方便后面用字符流将内容添加到文件encryption内
		String str="";
		try {
			str = new String(b,"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		try(FileWriter fr=new FileWriter(encryption)){
			char[] ch=str.toCharArray();
			fr.write(ch);
			System.out.println("加密后的内容：\n"+new String(ch));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		File f=new File("C:\\加密文件\\world.txt");
		File fi=new File("C:\\加密文件\\worlds.txt");
		encodeFile(f,fi);
	}
}
