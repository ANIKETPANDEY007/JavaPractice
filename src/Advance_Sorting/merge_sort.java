package Advance_Sorting;

public class merge_sort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a ,int[] b , int[] c){
        int i= 0 , j=0 , k = 0 ;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++] = a[i++] ;
                //c[k] = a[i]
                // k++;
                // i++ ;
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(j<b.length) c[k++] = b[j++] ;
        while(i<a.length) c[k++] = a[i++] ;
    }
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return ;
        // create two arrays with n/2 each .
        int[] a = new int[n/2] ;
        int[] b = new int[n-n/2] ;
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i] ;
        }
        for(int i = n/2 ; i<n ;i++){
            b[i-n/2] = arr[i] ;
        }
        // magic
        mergesort(a);
        mergesort(b);
        // merge a and b
        merge(a,b,arr) ;
        // delete a and b to decrease space complexity .
        a = null ;
        b = null ;
    }

    public static void main(String[] args) {
        int[] arr = {80,60,50,40,20,10,30,70} ;
        print(arr) ;
        mergesort(arr);
        print(arr) ;
    }
}
