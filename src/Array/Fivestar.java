package Array;

import java.util.*;

public class Fivestar {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nst = 1;
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a);
        System.out.println();
        System.out.print(b + "\t");
        // System.out.print(c+"\t");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nst; j++) {
                c = a + b;
                System.out.print(c + "\t");
                a = b;
                b = c;


            }


            nst++;
            System.out.println("");
        }


    }
}

