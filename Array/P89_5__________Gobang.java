import java.util.Scanner;

public class P89_5__________Gobang {
	public static void main(String[] args) {
	       char[][] ch=new char[11][11]; 
	       int a=48;
	       ch[0][0]=' ';
	       for(int i=1;i<ch.length;i++) {
	    	   ch[0][i]=ch[i][0]=(char)a;
	    	   a++;
	       }
	       for(int i=1;i<ch.length;i++) {
	    	   for(int j=1;j<ch[i].length;j++) {
	    		   ch[i][j]='-';
	    	   }
	       }
	       Scanner Sc=new Scanner(System.in);
	       int num[]=new int[2];
	       boolean boo=false;
	       int nums=0;
	       String str="";
	       while(true) {
	    	   if(str=="") {
	    		   for(char cha[]:ch) {
	            	   for(char c:cha) {
	            		   System.out.print(c+" ");
	            	   }
	            	   System.out.println();
	               }
	    	   }
	    	   System.out.println("---------------------");
	    	    if(nums%2==0) { 
			    		   System.out.println("请输入*的落子坐标");
			    		   for(int i=0;i<num.length;i++) {	
			    			   num[i]=Sc.nextInt();
			    		   } 
			    	   }
			      
			    else {		
			    			System.out.println("请输入o的落子坐标");
			    		    for(int i=0;i<num.length;i++) {	
			    			   num[i]=Sc.nextInt();
			    		} 
			    }
	    	    if(num[0]>7 && num[0]<0 && num[1]>7 && num[1]<0 &&(num[0]==0&num[1]==0)) {
	    	    	System.out.println("该坐标不能落子！");
	    	    	continue;
	    	    }
		       if(ch[num[1]][num[0]+2]=='*' || ch[num[1]][num[0]+2]=='o') {
		    	   str="该点已落子，请重新落子";
		    	   System.out.println(str);
		       }else {
		    	   str="";
		    	   if(nums%2==0) {
		    		   ch[num[1]][num[0]+2]='*';
		    	   }else {
		    		   ch[num[1]][num[0]+2]='o';	    		  
		    	   }
		    	   nums++;
		       }
		       if(boo) {
		    	   System.out.println("游戏结束！");
		       }
	       }
	    }
}
