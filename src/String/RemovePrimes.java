package String;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

        public static void solution(ArrayList<Integer> al){
            // write your code here

            int size1=al.size();
            int k=0;

            for(int i=0;i<size1;i++){
                System.out.println(al.get(k));
                if(isPrime(al.get(k))){
                    al.remove(k);
                    k++;
                }
            }

        }

        public static boolean isPrime(int val){
            //	System.out.println(val);
            boolean isprime=false;
            for(int i=2;i*i<=val;i++){
                if(val%i==0){
                    isprime=true;
                    break;
                }
            }

            if(isprime==false){
                return true;
            }
            else{
                return false;
            }

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = 4;
            ArrayList<Integer> al = new ArrayList<>();
//            for(int i = 0 ; i < n; i++){
//                al.add(scn.nextInt());
//            }
            al.add(3);
            al.add(12);
            al.add(13);
            al.add(15);

            solution(al);
            System.out.println(al);
        }

    }

