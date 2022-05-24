package GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Construct {
    public class Node{
        int data;
        ArrayList<Node>children;

        public Node(int data){
            this.data=data;
            children=new ArrayList<>();
        }
    }

    public Node ConstructTree(int [] arr){
        Stack<Node>stk=new Stack<>();
        Node root = new Node(arr[0]);
        stk.push(root);
        for(int i=1;i<arr.length;i++) {
            if(arr[i]==-1){
                stk.pop();
            }
            else{
                Node nde=new Node(arr[i]);
                stk.peek().children.add(nde);
                stk.push(nde);
            }
        }

        return root;
    }

    public void display(Node head){
        String str=head.data+"->";
        for(Node child:head.children){
            str+=child.data+",";
        }

       str+=".";
        System.out.println(str);

        for(Node child: head.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Construct tree=new Construct();
         Node head=tree.ConstructTree(arr);
         tree.display(head);

    }


}
