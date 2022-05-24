//import java.util.Scanner;
//
//public class AnyBaseToAny {
//        public static void main(String[] args) {
//            Scanner scn = new Scanner(System.in);
//            int n = 111001;
//            int sourceBase = 2;
//            int  destBase= 3;
//            int result=AnyBaseToAny(n,sourceBase,destBase);
//            System.out.print(result);
//        }
//
//        public static int AnyBaseToAny(int n,int sourceBase, int destBase){
//            //here we convert from sourceBase to decimal
//            int n0=n;
//            int i=0;
//            int finalResult=0;
//            double item=0;
//            int result=0;
//            while(n0>0){
//                int q=n%10;
//                item=Math.pow(sourceBase,i);
//                result+=item*q;
//                i++;
//                n/=10;
//            }
//            Integer.MAX_VALUE
//            finalResult=DecimalToDest(result,destBase);
//
//            return finalResult;
//
//        }
//
//
//        public static int DecimalToDest(int decimal,int destBase){
//            // here we convert from decimal to destBase
//
//            StringBuilder sb=new StringBuilder();
//            while(decimal>0){
//                int q=decimal%destBase;
//                sb.append(q);
//                decimal/=destBase;
//
//            }
//
//
//            return Integer.parseInt(sb.toString());
//        }
//
//
//    }
//
