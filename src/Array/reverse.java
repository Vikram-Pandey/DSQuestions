package Array;

public class reverse {
    public static void main(String[] args) {
        int n1=5;
        //scn.nextInt();
        int [] a={3,1,0,7,5};
        for(int i=0, j=a.length-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+"\t");
        }

    }
}
