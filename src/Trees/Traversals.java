package Trees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack ;

public class Traversals {
    private static void preorder(TreeNode root) {  // Root-Left-Right
        // Base case .
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left); // Left Subtree .
        preorder(root.right);  // Right Subtree .
    }
    private static void inorder(TreeNode root) { //  Left-Root-Right
        // Base case .
        if (root == null) return;
        inorder(root.left); // Left Subtree .
        System.out.print(root.val + " ");
        inorder(root.right);  // Right Subtree .
    }
    private static void postorder(TreeNode root) { //  Left-Root-Right
        // Iterative
        // Base case .
        if (root == null) return ;
        postorder(root.left); // Left Subtree .
        postorder(root.right);  // Right Subtree .
        System.out.print(root.val + " ");
    }
    private static void postorder2(TreeNode root) { //  Left-Root-Right

        Stack<TreeNode> st = new Stack<>() ;
        List<Integer> ans = new ArrayList<>() ;
        if(root!=null) st.push(root);
        while(st.size()>0){
            TreeNode top = st.pop() ;
            ans.add(top.val) ;
            if(top.left!=null)st.push(top.left) ;
            if(top.right!=null)st.push(top.right) ;
        }
        Collections.reverse(ans) ;
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a) ;
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a) ;
        System.out.println();
        System.out.print("Postorder 2 : ");
        postorder2(a) ;

    }
}