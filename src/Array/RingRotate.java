package Array;

import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }

        int s=scn.nextInt();

        int r=scn.nextInt();

        fill1Dfrom2D(a,s);

        for(int i=0;i<10;i++){
            System.out.println(fill1Dfrom2D(a,s)[i]);
        }

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] fill1Dfrom2D(int [][]arr,int s){
        int n=arr.length;
        int m=arr[0].length;
        int size=2*((n-s)+(m-s));
        int [] a=new int [15];

        int cmin=0+(s-1);
        int rmin=0+(s-1);
        int rmax=n-(s-1);
        int cmax=m-(s-1);

        int count=0;

        for(int row=rmin;row<rmax;row++){
            a[count]=arr[row][cmin];
            count++;
        }
        cmin++;

        for(int col=cmin;col<cmax;col++){
            a[count]=arr[rmax][col];
            count++;
        }

        rmax--;

        for(int row=rmax;row>=rmin;row--){
            a[count]=arr[row][cmax];
            count++;
        }

        cmax--;

        for(int col=cmax;col>=cmin;col--){
            a[count]=arr[rmin][cmax];
            count++;
        }


        return a;


    }



}