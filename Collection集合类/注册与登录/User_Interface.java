package ע�����¼;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ע�����¼.Database���ݿ�;
public class User_Interface {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);				
		while(true) {
			System.out.println("��ѡ���ܣ�A.ע��	B.��¼");
			String str=Scan.nextLine();
			if("A".equalsIgnoreCase(str)) {
				System.out.println("�������û�����");
				String UserName=Scan.nextLine();
//				if(Database���ݿ�.Query(L,str,"iu")) {
//					System.out.println("���û����ѱ�ע��!!!������ע��");
//					continue;
//				}else {
					System.out.println("���������룺");
					String password=Scan.nextLine();
					
					Database���ݿ�.EnterLibrary(UserName, password);					
//				}
				
			}else if("B".equalsIgnoreCase(str)) {
				System.out.println("�������û�����");
				String UserName=Scan.nextLine();
				
				System.out.println("���������룺");
				String password=Scan.nextLine();
				if(Database���ݿ�.Query(UserName, password))
					System.out.println("��½�ɹ�");
				else 
					System.out.println("������󣬵�¼ʧ�ܣ�");
			}else {
				System.out.println("�޴˹��ܣ�����������ѡ���ܡ�");
				continue;
			}
			System.out.println("�Ƿ����������y/n");
			String st=Scan.nextLine();
			if("y".equals(st)) continue;
			else break;
		}
		System.out.println(Database���ݿ�.AL);
	}
}
