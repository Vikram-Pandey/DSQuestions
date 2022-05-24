package Array;

import  java.util.*;
public class SumOfTwoArray {
        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn=new Scanner(System.in);
            int n1=5;
                    //scn.nextInt();
            int [] arr1={3,1,0,7,5};
                    //new int [n1];

//            for(int i=0;i<n1;i++){
//                arr1[i]=scn.nextInt();
//            }

            int n2=6;
                   // scn.nextInt();
            int [] arr2={1,1,1,1,1,1};
                    //new int [n2];

//            for(int i=0;i<n2;i++){
//
//                arr2[i]=scn.nextInt();
//            }

            // Get the new array size
            int len=(arr1.length>arr2.length)?arr1.length:arr2.length;

            if(arr1.length>arr2.length){
                if(arr1[0]>8){
                    len++;
                }
            }
            else{
                if(arr2[0]>8){
                    len++;
                }
            }

            int [] result=new int [len];

            int carry=0;
            int i=arr1.length-1;
            int j=arr2.length-1;
            int k=result.length-1;


            while(k>=0){
                int sum=0;
                if(i>=0){
                    sum+=arr1[i];
                }

                if(j>=0){
                    sum+=arr2[j];
                }



                sum+=carry;
                int r=sum%10;
                int q=sum/10;

                result[k]=r;

                carry=q;

                i--;
                j--;
                k--;





            }


            for(int z=0;z<len;z++){
                System.out.println(result[z]);
            }



        }
    }

