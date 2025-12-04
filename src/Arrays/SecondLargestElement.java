package Arrays;

public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int max1 = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        int max2 = Integer.MIN_VALUE ;
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]>max1) max1 = nums[i] ;
            if(nums[i]<min) min = nums[i] ;
        }
        if(min==max1) return -1 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]>max2 ) {
                if(nums[i]!=max1) max2 = nums[i] ;
            }
        }
        return max2 ;
    }
    public static void main(String[] args) {
        int[] nums = {8,8,7,6,5,8,9} ;
        System.out.println(secondLargestElement(nums) );
    }
}
