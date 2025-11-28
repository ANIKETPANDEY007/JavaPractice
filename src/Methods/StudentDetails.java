package Methods;

public class StudentDetails {
    public static void details(String name , int age ,String Grade , int Class){
        System.out.println("My name is "+name+" and my age is "+age+" and studying in class "+ Class +"-"+Grade);
    }
    public static void main(String[] args) {
            details("Aniket",18,"I",13);
    }
}
