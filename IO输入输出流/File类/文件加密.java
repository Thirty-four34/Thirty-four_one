package File��;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class �ļ����� {
	static byte b[]=null;
	public static void encodeFile(File original, File encryption) {
		//���ֽ�������ʽ��ȡ�ļ����ݣ��������Ĳ���
		try(FileInputStream fis=new FileInputStream(original)){
			b=new byte[(int)original.length()];
			fis.read(b);
			//��ΪĿ���ļ���"UTF-8"��ʽ������Ҫ��"UTF-8"�ĸ�ʽ��ӡ���������Ļ����
			System.out.println("����ǰ�����ݣ�\n"+new String(b,"UTF-8"));
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
		//�����ܵ�����ת��Ϊ�ַ���������������ַ�����������ӵ��ļ�encryption��
		String str="";
		try {
			str = new String(b,"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		try(FileWriter fr=new FileWriter(encryption)){
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
		File f=new File("C:\\�����ļ�\\world.txt");
		File fi=new File("C:\\�����ļ�\\worlds.txt");
		encodeFile(f,fi);
	}
}
