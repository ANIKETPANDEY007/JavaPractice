package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :-");
        int n = sc.nextInt() ;
        System.out.print("Enter the array :-");
        int[] arr = new int[n] ;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the value to search : ");
        int x = sc.nextInt() ;
        boolean flag = false ;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                flag=true ;
                System.out.print("Element Found");
                break;
            }
        }
        if(flag==false){
            System.out.print("Element not found");
        }
    }
}
