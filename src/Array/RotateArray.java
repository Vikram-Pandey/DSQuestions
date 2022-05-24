//import java.util.List;
//
//public class RotateArray {
//    public static void main(String[] args) {
//        int [] a={1,2,3,4,5};
//        int k=3;
//
//        rotate(a,k);
//    }
//
//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//        // Write your code here
//        int n=arr.size();
//
//
//        //reverse all the nums
//
//        for(int i=0,j=n-1;i<=j;i++,j--){
//            int temp=arr.get(i);
//            arr.add(i,arr.get(j));
//            arr.add(j,temp);
//        }
//
//        //reverse from 0 to d-1
//
//        for(int i=0,j=d-1;i<=j;i++,j--){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//
//        // reverse d to n-1
//
//        for(int i=d,j=n-1;i<=j;i++,j--){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//
//        return arr;
//
//    }
//
//}
