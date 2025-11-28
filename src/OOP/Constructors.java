package OOP;
// Constructor Overloading .
public class Constructors {
    public static  class Car{
        int seats; // 0
        String name; // null
        double length ; // 0.0
        Car(){ // default constructor
        // agar hum ye yaha create nhi kiye hote to c3 me error hota kyuki hm next line me parametrized constructor create kiye hai aur hm c3 par value pass nhi kar rhe hai .
        }
        Car(int x , String s , double d){ // Parameterized Constructor
            seats = x ;
            name = s ;
            length = d ;
        }
        void print(){
            System.out.println(name+" "+length+" "+seats);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia Sonet",3.99) ;
        c1.print();
        Car c2 = new Car(6,"Audi",4.3) ;
        c2.print();
        Car c3 = new Car() ;
        c3.name = "Aniket" ;
    }
}
