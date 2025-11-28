package Arrays;

public class ArrOfArr {
    public static void main(String[] args) {
        int[][] b = {{1,2,3},{4,5,6}} ;
        // Output using for each loop
        for(int[] ele:b){
            for(int x:ele){
                System.out.print(x+" ");
            }
        }
    }
}
