package OOP;

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer() ;
//        c1.country = "England" ; // Error
//        System.out.println(c1.country);
        Cricketer c2 = new Cricketer() ;
        c1.country = "India" ;
        System.out.println(c2.country); // it also changes the country at the point of initialization.
    }
}
