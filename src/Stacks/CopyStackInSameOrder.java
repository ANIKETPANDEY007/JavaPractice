package Stacks;
import java.util.Stack ;
import java.util.Scanner ;
public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the no of elements :- ");
        int n = sc.nextInt() ;
        System.out.print("Enter the elements :-  ");
        for (int i = 1; i <=n ; i++) {
            int x = sc.nextInt() ;
            st.push(x) ;
        }
        System.out.println(st);
        //REVERSE order
        Stack<Integer> rt = new Stack<>() ;
        while(st.size()>0){
            rt.push(st.pop()) ;
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>() ;
        while(rt.size()>0){
            gt.push(rt.pop()) ;
        }
        System.out.println(gt);
    }
}
