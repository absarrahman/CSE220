package com.reaperhouse.absar.FINAL;

public class BT{
    public static Node buildTree(Object[]a,int i){
        if(i<=a.length-1 && a[i]!=null){
            return new Node(a[i],buildTree(a,2*i),buildTree(a,2*i+1));
        }else{
            return null;
        }
    }
    public static void printInOrder(Node root){
        if(root==null){}
        else{
            printInOrder(root.left);
            System.out.println(root.val);
            printInOrder(root.right);
        }
    }
    public static Node mirrorTree(Node root){
        if(root!=null){
            Node t = root.left;
            root.left = root.right;
            root.right = t;
            mirrorTree(root.right);
            mirrorTree(root.left);
        }
        return root;
    }
    public static void main(String[]args){
        Object[]array={null,50,25,75,10,30,60,90,-5,null,29,null,
                55,70,null,null,null,9,null,null,27,null,null,null,52,57,
                60,null,null,null,null,null,null,null,0,null,null,null
                ,null,null,26,28};
        Node root=buildTree(array,1);
        printInOrder(root);
        System.out.println("Mirror one");
        Node mirror=mirrorTree(root);
        printInOrder(mirror);
    }
}