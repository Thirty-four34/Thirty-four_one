import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class P89_4_______Tui_Xiang_Zhi {
	public static void main(String[] args) {
       char[][] ch=new char[8][10];       
       for(int i=0;i<ch[0].length;i++) {
    	   ch[0][i]=ch[7][i]='H';
       }
       for(int i=0;i<ch.length;i++) {
    	   ch[i][0]=ch[i][9]='H';
       }
       ch[1][1]='&';
       ch[2][2]='o';
       ch[1][3]=ch[2][3]=ch[2][5]=ch[3][3]=ch[3][5]=ch[3][6]=ch[3][8]='H';
       ch[4][8]=ch[5][4]=ch[5][5]=ch[5][6]='H';
       ch[6][4]='H';
       ch[6][5]='*';       
       int x=1,y=1;
       boolean boo=false;
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
    	   System.out.println("----------------------------------------");
	       System.out.println("A左移，D右移，W上移，S下移，请输入你的指令：");
	       Scanner Sc=new Scanner(System.in);
	       String c=Sc.nextLine();
	       switch(c.toUpperCase()) {
	       		case "A":
	       		if(ch[x][y-1]=='H' || (ch[x][y-2]=='H'&&ch[x][y-1]=='o')) {	
	       			str="无法移动，请重新输入";
	       			System.out.println(str);
	       			break;
	       		}else {
	       			str="";
	       			if(ch[x][y-2]=='*' & ch[x][y-1]=='o'){
	       				boo=true;
	       				break;
	       			}else if(ch[x][y-1]=='o'){
	       				ch[x][y-2]='o';
	       				ch[x][y-1]='&';
	       				ch[x][y]=' ';
	       				y--;
	       				break;
	       			}else {
	       				ch[x][y-1]='&';
	       				ch[x][y]=' ';
	       				y--;
	       				break;
	       			}
	       		}
	       		case "D":
		       		if(ch[x][y+1]=='H' || (ch[x][y+2]=='H'&&ch[x][y+1]=='o')) {	
		       			str="无法移动，请重新输入";
		       			System.out.println(str);
		       			break;
		       		}else {
		       			str="";
		       			if(ch[x][y+2]=='*' & ch[x][y+1]=='o'){
		       				boo=true;
		       				break;
		       			}else if(ch[x][y+1]=='o'){
		       				ch[x][y+2]='o';
		       				ch[x][y+1]='&';
		       				ch[x][y]=' ';
		       				y++;
		       				break;
		       			}else {
		       				ch[x][y+1]='&';
		       				ch[x][y]=' ';
		       				y++;
		       				break;
		       			}
		       		}
	       		case "W":
	       			if(ch[x-1][y]=='H' || (ch[x-2][y]=='H'&&ch[x-1][y]=='o')) {	
	       				str="无法移动，请重新输入";
		       			System.out.println(str);
		       			break;
		       		}else {
		       			str="";
		       			if(ch[x-2][y]=='*' & ch[x-1][y]=='o'){
		       				boo=true;
		       				break;
		       			}else if(ch[x-1][y]=='o'){
		       				ch[x-2][y]='o';
		       				ch[x-1][y]='&';
		       				ch[x][y]=' ';
		       				x--;
		       				break;
		       			}else {
		       				ch[x-1][y]='&';
		       				ch[x][y]=' ';
		       				x--;
		       				break;
		       			}
		       		}
	       		case "S":
		       		if(ch[x+1][y]=='H' || (ch[x+2][y]=='H'&&ch[x+1][y]=='o')) {	
		       			str="无法移动，请重新输入";
		       			System.out.println(str);
		       			break;
		       		}else {
		       			str="";
		       			if(ch[x+2][y]=='*' & ch[x+1][y]=='o'){
		       				boo=true;
		       				break;
		       			}else if(ch[x+1][y]=='o'){
		       				ch[x+2][y]='o';
		       				ch[x+1][y]='&';
		       				ch[x][y]=' ';
		       				x++;
		       				break;
		       			}else {
		       				ch[x+1][y]='&';
		       				ch[x][y]=' ';
		       				x++;
		       				break;
		       			}
		       		}
		       	}
	       if(boo) {
	    	   System.out.println("游戏结束！");
	    	   break;
	       }
       }
    }
}
