package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practice3Answer {
	 static String creatpass(){
	        String c = "";
	        Random rand = new Random();
	        List<String> sl = new ArrayList<>();
	        for (int i = 48;i<58;i++){
	            sl.add(String.valueOf((char)i));
	        }
	        for (int i = 65;i<91;i++){
	            sl.add(String.valueOf((char)i));
	        }
	        for (int i = 97;i<122;i++){
	            sl.add(String.valueOf((char)i));
	        }
	        for (int i = 0;i<3;i++){
	            String rr = sl.get(rand.nextInt(sl.size()));
	            c += rr;	         
	        }
	        return c;
	    }
	 
	    static void crackpass(String rawpas,int times){
	            String cps = creatpass();
	            if (cps.equals(rawpas)){
	                System.out.println("匹配到对应密码，尝试次数为"+times);
	            }
	            else {
	                times +=1;
	                crackpass(rawpas,times);
	            }
	        }
	    public static void main(String[] args) {
	 
	        String newpass = creatpass();
	        int times = 0;
	        System.out.println(newpass);
	        //递归容易线程栈空间被耗尽
	        //crackpass(newpass,times);
	        //for循环
	        for (int i = 0;i<=100000;i++){
	            String cpass = creatpass();
	            if(cpass.equals(newpass)){
	                System.out.println("匹配到对应密码，尝试次数为"+i);
	                break;
	            }
	        }
	 
	    }
}
