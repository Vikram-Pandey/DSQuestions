package Array;

public class OpenClose {
    public boolean isValid(String s) {

        for(int i=0,j=1;j<s.length();){
            if(s.charAt(i)=='(' && s.charAt(j)==')'){
                i=i+2;
                j=j+2;
            }

            else if(s.charAt(i)=='[' && s.charAt(j)==']'){
                i=i+2;
                j=j+2;
            }

            else if(s.charAt(i)=='{' && s.charAt(j)=='}'){
                i=i+2;
                j=j+2;
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        OpenClose b=new OpenClose();
        b.isValid("()[]{}");
    }
}
