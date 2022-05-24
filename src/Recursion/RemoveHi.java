package Recursion;

import java.io.*;
import java.util.*;

public class RemoveHi {
int count=0;
    public String removehi(String s){
    StringBuilder sb=new StringBuilder();
    int count=0;
    String result=removehi1(s,sb,count);
    return result;

    }

    public int counthi(String s){
        return counthi1(s);
    }

    public int counthi1(String s){
        if(s.length()==0){
            return -1;
        }

        if(s.charAt(0)=='h' && s.charAt(1)=='i'){
            this.count=this.count+1;
            counthi1(s.substring(2));
        }
        else{
            counthi1(s.substring(2));
        }

     return this.count;
    }

    public String removehi1(String s, StringBuilder sb, int count){
        if(s.length()==0){
            return "";
        }

        if(s.charAt(0)=='h' && s.charAt(1)=='i'){
            removehi1(s.substring(2),sb,count+1);
        }
        else{
            removehi1(s.substring(2),sb.append(s.substring(0,2)),count+1);
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        Scanner scn=new Scanner(System.in);
        String sinput="hihihij";

        RemoveHi sb=new RemoveHi();
        System.out.print(sb.removehi(sinput));

        System.out.println(sb.counthi(sinput));



    }
}
