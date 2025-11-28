package Trees;

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
        // Base case .
        if (root == null) return ;
        postorder(root.left); // Left Subtree .
        System.out.print(root.val + " ");
        postorder(root.right);  // Right Subtree .
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
        System.out.print("Postorder : ");
        inorder(a) ;
        System.out.println();
        System.out.print("Inorder : ");
        postorder(a) ;

    }
}