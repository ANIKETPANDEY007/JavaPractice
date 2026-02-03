package Heaps;
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int val){
        this.val = val ;
    }
}
public class isBTaMaxHeap {
    public static boolean isMaxHeap(TreeNode root){
        int n = size(root) ;
        return isHeap(root) && isCBT(root,0,n) ;
    }
    public static int size(TreeNode root){
        if(root==null) return 0 ;
        return 1 + size(root.left) + size(root.right) ;
    }
    private static boolean isCBT(TreeNode root,int i,Integer n){
        if(root==null) return true ;
        if(i>=n) return false ;
        return isCBT(root.left,2*i+1,n) && isCBT(root.right,2*i+2,n) ;
    }
    private static boolean isHeap(TreeNode root){
        if(root==null) return true ;
        if(root.left!=null){
            if(root.val<root.left.val) return false ;
        }
        if(root.right!=null){
            if(root.val<root.right.val) return false ;
        }
        return isHeap(root.left) && isHeap(root.right) ;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10) ;
        TreeNode b = new TreeNode(8) ;
        TreeNode c = new TreeNode(7) ;
        TreeNode d = new TreeNode(6) ;
        TreeNode e = new TreeNode(4) ;
        a.left = b ; a.right = c ;
        b.left = d ; b.right = e ;
        System.out.println(isMaxHeap(a));
    }
}
