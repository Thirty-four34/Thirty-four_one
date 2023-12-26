package 泛型;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import 配件.Student;

public class 存储自定义对象__使用泛型 {
		public static void main(String[] args) {
			List<Student> li=new ArrayList<Student>();
			li.add(new Student("a",45));
			li.add(new Student("b",32));
			li.add(new Student("c",15));
			li.add(new Student("d",73));
			li.add(new Student("e",96));
			//迭代器的泛型要和集合的一样
			ListIterator<Student> LI=li.listIterator();
			while(LI.hasNext()) {
				//next()方法返回的元素不再是object类，而是泛型的类型
				//所以不需要强制转换
				Student st=LI.next();
				System.out.println(st.getName()+"..."+st.getAge());
			}
		}
}
