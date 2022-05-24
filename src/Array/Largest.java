package Array;

public class Largest {
    public static void main(String[] args) {
        int a=23;
        int b=45;
        int c=12;

        if(a>b && a>c){
            System.out.println("Largest is a:"+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest is b:"+b);
        }
        else{
            System.out.println("Largest is c:"+c);
        }
    }
}
