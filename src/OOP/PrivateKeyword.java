package OOP;

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students() ;
        s1.cgpa = 8.9 ;
        s1.name = "Aniket" ;
        // s1.rno ;  can't be accessed
        s1.print();
    }
}
