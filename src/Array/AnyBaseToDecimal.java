package Array;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 111001;
        int b = 2;
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
        int i=0;
        int result=0;
        double item=0;

        while(n>0){
            int q=n*10;
            item=(Math.pow(b,i));
            result+=item*q;
            n/=10;
            i++;

        }

        return result;
    }
}
