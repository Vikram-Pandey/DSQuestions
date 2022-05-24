package Array;

import java.util.HashMap;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 281664941;
        int d = 7;
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        HashMap<Integer,Integer> hmap=new HashMap();

        while(n>0){
            int q=n%10;
            if(!hmap.containsKey(q)){
                hmap.put(q,1);
            }
            else{
                int val=hmap.get(q);
                val=val+1;
                hmap.put(q,val);
            }

            n=n/10;
        }

        int result= hmap.get(d);
        return result;
    }
}

