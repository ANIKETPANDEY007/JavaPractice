package Trees;
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int val){
        this.val = val ;
    }
}
public class NodeOfTree {
    private static void display(TreeNode root){
        // Base case .
        if(root==null) return ;
        System.out.print(root.val+" ");
        display(root.left) ; // Left Subtree .
        display(root.right) ;  // Right Subtree .
    }
    private static int sum(TreeNode root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right) ;
    }
    private static int mul(TreeNode root){
        if(root==null) return 1 ;
        return (root.val * mul(root.left) * mul(root.right)) ;
    }
    private static int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE ;
        return Math.max(root.val,Math.max(max(root.left),max(root.right))) ;
    }
    private static int size(TreeNode root){
        if(root==null) return 0 ;
        return 1+size(root.left)+size(root.right) ;
    }
    public static int levels(TreeNode root){
        if(root==null) return 0 ;
        return 1+Math.max(levels(root.left),levels(root.right)) ;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1) ;
        TreeNode b = new TreeNode(4) ;
        TreeNode c = new TreeNode(3) ;
        TreeNode d = new TreeNode(2) ;
        TreeNode e = new TreeNode(6) ;
        TreeNode f = new TreeNode(5) ;
        a.left = b ; a.right = c ;
        b.left = d ; b.right = e ;
        c.right = f ;
//        System.out.println(a.left.val);
//        System.out.println(b.val);
        display(a) ;
        System.out.println();
        System.out.println(sum(a));
        System.out.println(mul(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(levels(a));
    }

}
