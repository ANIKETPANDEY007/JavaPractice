package OOP;

public class Marks {
    public static class StudentData{
        String name ;
        int rno ;
        int size ;
        int[] marks ;
        StudentData(int s){
            marks = new int[s] ;
        }
    }

    public static void main(String[] args) {
        StudentData s1 = new StudentData(4) ;
        StudentData s2 = new StudentData(2) ;
        s1.marks[0] = 86 ;
        s1.marks[1] = 96 ;
        s1.marks[2] = 84 ;
        s1.marks[3] = 97 ;
    }
}
