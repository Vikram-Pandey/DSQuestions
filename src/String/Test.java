package String;

import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //int a=scn.nextInt();
       // int a=Integer.parseInt(scn.nextLine());
        String str="Pepcoding";

        String str1=str.substring(5,5);

      //  a=a+1;

       // System.out.println(a);
        System.out.println(str);
        System.out.println(str1);

        Date d=new Date();
        System.out.println("Old hour value is : "+d.getHours());
        d.setHours(12);;
        System.out.println("Hour value after setting is : "+d.getHours());

    }
}
