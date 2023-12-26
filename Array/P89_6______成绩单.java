//import java.util.Scanner;
//
//public class P89_6______????? {
//	public static void main(String[] args) {
//		 Scanner Sc=new Scanner(System.in);
//		   System.out.println("???????????????????");
//		   int num=Sc.nextInt();
//	       double dou[][]=new double[num][6];
//	       int i=num;
//	       while(i>0) {
//	    	   System.out.println("??????3??????????");
//		       int ID=Sc.nextInt();
//		       System.out.println("??????????????");
//		       int YW=Sc.nextInt();
//		       System.out.println("??????????????");
//		       int SX=Sc.nextInt();
//		       System.out.println("?????????????");
//		       int YY=Sc.nextInt();
//		       int sum=(YW+SX+YY);
//		       double D=(double)(sum/3);
//		       dou[ID-1][0]=ID;
//		       dou[ID-1][1]=YW;
//		       dou[ID-1][2]=SX;
//		       dou[ID-1][3]=YY;
//		       dou[ID-1][4]=D;
//		       dou[ID-1][5]=sum;
//		       i--;
//	       }
//	       System.out.println("??????\t??????\t??????\t?????\t??????\t????");
//	       for(double doub[]:dou) {
//	    	   for(double d:doub) {
//	    		   System.out.print(d+"\t");
//	    	   }
//	    	   System.out.println();
//	       }
//	}
//}
