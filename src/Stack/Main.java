import java.io.*;
import java.util.*;

public class Main{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code

        Stack<String>prefix=new Stack();
        Stack<Character> operator=new Stack();
        Stack<String> postfix=new Stack();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if(ch>='a' && ch<='z'){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else if(ch=='('){
                operator.push(ch);
            }
            else if(ch==')'){
                while(!operator.empty() && operator.peek()!='('){
                    char operator1=operator.pop();
                    String prefixoperand2=prefix.pop();
                    String prefixoperand1=prefix.pop();

                    String postfixoperand2=postfix.pop();
                    String posfixoperand1=postfix.pop();

                    String resultprefix= solvePrefix(prefixoperand1,prefixoperand2,operator1);
                    String postfixresult= solvePostfix(posfixoperand1,postfixoperand2,operator1);
                    prefix.push(resultprefix);
                    postfix.push(postfixresult);


                }

                operator.pop();
            }

            else if(ch=='+' || ch=='-' || ch== '*' || ch=='/'){
                while(!operator.empty() && precedence(operator.peek())>=precedence(ch)){
                    char operator1=operator.pop();
                    String prefixoperand2=prefix.pop();
                    String prefixoperand1=prefix.pop();

                    String postfixoperand2=postfix.pop();
                    String posfixoperand1=postfix.pop();

                    String resultprefix= solvePrefix(prefixoperand1,prefixoperand2,operator1);
                    String postfixresult= solvePostfix(posfixoperand1,postfixoperand2,operator1);
                    prefix.push(resultprefix);
                    postfix.push(postfixresult);
                }

                operator.push(ch);
            }

        }

        while(!operator.empty() ){
            char operator1=operator.pop();
            String prefixoperand2=prefix.pop();
            String prefixoperand1=prefix.pop();

            String postfixoperand2=postfix.pop();
            String posfixoperand1=postfix.pop();

            String resultprefix= solvePrefix(prefixoperand1,prefixoperand2,operator1);
            String postfixresult= solvePostfix(posfixoperand1,postfixoperand2,operator1);
            prefix.push(resultprefix);
            postfix.push(postfixresult);
        }

        System.out.print(postfix.peek());
        System.out.print(prefix.peek());



    }

    public static String solvePrefix(String operator1, String operator2, char operator){
        char ch=operator;

        switch(ch){
            case '+':
                return operator1 + operator2 + ch;
            case '-':
                return operator1 + operator2 + ch;

            case '*':
                return operator1 + operator2 + ch;

            case '/':
                return operator1 + operator2 + ch;
        }

        return "";

    }


    public static String solvePostfix(String operator1, String operator2, char operator){
        char ch=operator;

        switch(ch){
            case '+':
                return operator1 + operator2 + ch;

            case '-':
                return operator1 + operator2 + ch;

            case '*':
                return operator1 + operator2 + ch;

            case '/':
                return operator1 + operator2 + ch;
        }

        return "";



    }

    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if(ch=='/' || ch=='*'){
            return 2;
        }
        else {
            return 0;
        }
    }


}