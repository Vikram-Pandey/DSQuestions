package Array;

import java.util.Scanner;

public class BarChart {
        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn=new Scanner(System.in);
            int n=5;
                    //scn.nextInt();
            int [] arr= {3,1,0,7,5};
                    //new int [n];

//            for(int i=0;i<n;i++){
//                arr[i]=scn.nextInt();
//            }

            for(int i=7;i>0;i--){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>=i){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }

                System.out.println( );
            }
        }

    }

