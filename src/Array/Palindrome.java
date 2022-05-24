package Array;

public class Palindrome {
    public boolean isPalindrome(int x) {
        StringBuilder sb=new StringBuilder();
 int n=x;
        while(x>0){
            sb.append(x%10);
            x/=10;
        }

        StringBuilder original=new StringBuilder();
        original.append(n);

        if(original.toString().equals(sb.toString())){
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;

    }

    public static void main(String[] args) {
        Palindrome isPal=new Palindrome();
        isPal.isPalindrome(0);
    }
}
