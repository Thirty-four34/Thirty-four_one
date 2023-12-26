import Åä¼þ.Student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.ListIterator;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

public class fsf1 {
    public static void main(String[] args) {
        String Str="aababcabcdabcde";
        char[] ch=Str.toCharArray();
        TreeMap<Character, Integer> tm = new TreeMap<Character,Integer>();
        for(char c:ch){
            Character C=(Character)c;
            if(!tm.containsKey(C)){
                tm.put(C,1);
            }else{
                Integer I=tm.get(C)+1;
                tm.put(C,I);
            }
        }
        Set<Character> set=tm.keySet();
        Iterator<Character> it=set.iterator();
        while (it.hasNext()) {
            Character c=it.next();
            System.out.println(c+"("+tm.get(c)+")");
        }
    }
}



