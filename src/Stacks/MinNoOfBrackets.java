package Stacks;
import java.util.* ;
public class MinNoOfBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>() ;
        int n = str.length() ;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i) ;
            if(ch=='('){
                st.push(ch) ;
            } else if (ch==')') {
                if(st.size()==0) return false ;
                else if(st.peek()=='(') {
                    st.pop() ;
                }
            }
        }
        if(st.size()>0){
            min(st.size());
            return false ;
        }
        return true ;
    }
    public static void min(int size){
        System.out.println("The minimum number of brackets to remove to balance is " + size);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the Brackets : ");
        String str = sc.nextLine() ;
       isBalanced(str);
    }
}
