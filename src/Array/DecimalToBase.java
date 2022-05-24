package Array;

public class DecimalToBase {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
        int n = 114;
        int b = 5;
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        StringBuilder sb=new StringBuilder();

        while(n>0){
            int q=n%b;
            sb.append(q);
            n/=b;
        }

        int val=Integer.parseInt(sb.reverse().toString());
        return val;
    }
}

