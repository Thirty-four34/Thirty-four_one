package File��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class �ļ����� {
	static byte b[]=null;
	public static void encodeFile(File encryption, File original) {
		//���ֽ�������ʽ��ȡ�ļ����ݣ��������Ĳ���
		try(FileInputStream fis=new FileInputStream(encryption)){
			b=new byte[(int)encryption.length()];
			fis.read(b);
			System.out.println("����ǰ�����ݣ�\n"+new String(b));
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//��ʼ���ļ����м���
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
		//�����ܵ�����ת��Ϊ�ַ���������������ַ�����������ӵ��ļ�encryption��
		String str=new String(b);
		try(FileWriter fr=new FileWriter(original)){
			char[] ch=str.toCharArray();
			fr.write(ch);
			System.out.println("���ܺ�����ݣ�\n"+new String(ch));
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		File f=new File("C:\\�����ļ�\\worlds.txt");
		File fi=new File("C:\\�����ļ�\\worldss.txt");
		encodeFile(f,fi);
	}
}
