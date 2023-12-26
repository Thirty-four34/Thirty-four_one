package File类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class 文件解密 {
	static byte b[]=null;
	public static void encodeFile(File encryption, File original) {
		//以字节流的形式读取文件内容，方便后面的操作
		try(FileInputStream fis=new FileInputStream(encryption)){
			b=new byte[(int)encryption.length()];
			fis.read(b);
			System.out.println("加密前的内容：\n"+new String(b));
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
				if(b[i]==65) {
					b[i]=90;
				}else {
					b[i]=(byte) (b[i]-1);
					}
			}
			else if(47<b[i] & b[i]<58) {
				if(b[i]==48) {
					b[i]=57;
				}else {
					b[i]=(byte) (b[i]-1);
					}
			}
			else if(96<b[i] & b[i]<123) {
				if(b[i]==97) {
					b[i]=122;
				}else {
				b[i]=(byte) (b[i]-1);
				}
			}
		}
		//将加密的数据转换为字符串，方便后面用字符流将内容添加到文件encryption内
		String str=new String(b);
		try(FileWriter fr=new FileWriter(original)){
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
		File f=new File("C:\\加密文件\\worlds.txt");
		File fi=new File("C:\\加密文件\\worldss.txt");
		encodeFile(f,fi);
	}
}
