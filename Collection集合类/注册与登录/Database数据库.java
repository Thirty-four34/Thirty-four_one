package ע�����¼;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Database���ݿ� {
	public static ArrayList<User> AL=new ArrayList<User>();
	public static void EnterLibrary(String name,String password) {
		AL.add(new User(name,password));
		System.out.println("ע��ɹ�");
	}
	public static boolean Query(String name,String password) {	
//		ListIterator<User> LI=AL.listIterator();
//		while(LI.hasNext()) {
//			User u=LI.next();
//			if( u.getUserName()==name && u.getPassword()==password)
//				return true;
//		}
//		return false;
		return AL.contains(new User(name,password));
	}
}
