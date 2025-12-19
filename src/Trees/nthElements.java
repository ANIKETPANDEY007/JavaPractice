package Trees;

import java.util.Scanner;

public class nthElements {
    static  int n ;
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        Scanner sc = new Scanner(System.in);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
//        System.out.print("Enter n  : ");
//        n = sc.nextInt();
//        nThLevel(a,0) ;
        for (int i = 0; i <= 2; i++) {
            n = i ;
            nThLevel(a,0);
            System.out.println();
        }
    }
    public static void nThLevel(TreeNode root,int level){ // print using dfs
        if (root == null) return;
        if(level==n) System.out.print(root.val + " ");
        nThLevel(root.left,level+1); // Left Subtree .
        nThLevel(root.right,level+1);  // Right Subtree .
    }
}
