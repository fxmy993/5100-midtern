package edu.northeastern.fxmy;
import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class question4 {

    public static void main(String[] args) {



    }



    //Time: O(n) Space: O(n)
    public static void question4(Tree a){
        if(a.root == null){
            return;
        }
        int count = 0;
        int deep = 1;
//        Queue< TreeNode >  queue1 = new LinkedList<Object>();
        Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(a.root);
        queue.add(null);

        while( queue.isEmpty() == false ){
            deep++;
            TreeNode node = queue.remove();
            count = 0;
            if(node != null){
                System.out.print(node.data + ", ");
                if(node.left != null&&count<=deep){
                    queue.add(node.left);
                    count++;
                }
                if(node.right != null&&count<=deep){
                    queue.add(node.right);
                    count++;
                }
            }else{
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                queue.add(null);
            }
        }
        System.out.println();
    }
}
