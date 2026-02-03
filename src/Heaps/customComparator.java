package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno ;
    double perc ;
    String name ;
    Student(int rno,double perc,String name){
        this.rno = rno ;
        this.perc = perc ;
        this.name = name ;
    }
    public int compareTo(Student s){
        return this.rno - s.rno ;
        // Generally we take the element in int or cast it to integer.
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].perc+" ");
            System.out.println(arr[i].rno);
        }
    }
    public static void main(String[] args) {
        Student[] s = new Student[4] ;
        s[0] = new Student(76,89.2,"Aniket") ;
        s[1] = new Student(75,80.5,"Snehal") ;
        s[2] = new Student(74,75.9,"Abhay") ;
        s[3] = new Student(73,92.6,"Rahul") ;
        print(s) ;
        Arrays.sort(s);
        print(s);
    }
}
