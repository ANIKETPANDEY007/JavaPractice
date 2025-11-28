package Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34} ;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr ; //Shallow Copy
        for(int ele: nums){
            System.out.print(ele+" ");
        }
    }
}
