package Advance_Sorting;

import java.util.Scanner;

public class kthSmallestElement {
    static int ans ;
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static int partion(int[] arr,int lo , int hi){
        int mid = (lo+hi)/2 ;
        int pivot = arr[mid] , pIdx = mid ;
        int smallerCount = 0 ;
        for(int i=lo+1 ; i<=hi ; i++ ){
            if(i==mid) continue ;
            if(arr[i]<=pivot) smallerCount++ ;
        }
        int correctIdx = lo + smallerCount ;
        // swap arr[pIdx] & arr[cIdx]
        swap(arr,pIdx,correctIdx);
        int i=lo , j = hi ;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<pivot) i++ ;
            else if (arr[j]>pivot) j-- ;
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr,i,j) ;
            }
        }
        return correctIdx ;
    }
    public static void quickSelect(int[] arr,int lo , int hi,int k){
        if(lo>hi) return ;
        if(lo==hi){
            if(lo==k-1) ans = arr[lo];
            return ;
        }
        // pivot (arr[lo]) ko sahi jagah rakho .
        // & left part me <=arr[lo] & right me >arr[lo]
        int idx = partion(arr,lo,hi) ;
        if(idx==k-1){
            ans = arr[idx] ;
            return ;
        }
        if(k-1 < idx ) quickSelect(arr,lo,idx-1,k);
        else quickSelect(arr,idx+1,hi,k);

    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 4,9,7,1,2,6,5,8} ;
        int n = arr.length ;
        print(arr);
        Scanner sc = new Scanner(System.in) ;
        int k = sc.nextInt() ;
        ans = -1 ;
        quickSelect(arr,0,n-1,k) ;
        System.out.println(ans);
    }
}
