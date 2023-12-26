package 注册与登录;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import 注册与登录.Database数据库;
public class User_Interface {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);				
		while(true) {
			System.out.println("请选择功能：A.注册	B.登录");
			String str=Scan.nextLine();
			if("A".equalsIgnoreCase(str)) {
				System.out.println("请输入用户名：");
				String UserName=Scan.nextLine();
//				if(Database数据库.Query(L,str,"iu")) {
//					System.out.println("该用户名已被注册!!!请重新注册");
//					continue;
//				}else {
					System.out.println("请输入密码：");
					String password=Scan.nextLine();
					
					Database数据库.EnterLibrary(UserName, password);					
//				}
				
			}else if("B".equalsIgnoreCase(str)) {
				System.out.println("请输入用户名：");
				String UserName=Scan.nextLine();
				
				System.out.println("请输入密码：");
				String password=Scan.nextLine();
				if(Database数据库.Query(UserName, password))
					System.out.println("登陆成功");
				else 
					System.out.println("密码错误，登录失败！");
			}else {
				System.out.println("无此功能！！！请重新选择功能。");
				continue;
			}
			System.out.println("是否继续操作？y/n");
			String st=Scan.nextLine();
			if("y".equals(st)) continue;
			else break;
		}
		System.out.println(Database数据库.AL);
	}
}
