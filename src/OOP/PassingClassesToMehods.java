package OOP;

public class PassingClassesToMehods {
    public static class Car{
        int seat ;
        String name ;
        double length ;
        int torque ;
        String type ;
        void print(){
            System.out.print(name+" " + length +" " + torque +" " +seat + " " +type);
        }
    }

    public static void main(String[] args) {
        Car c = new Car() ;
        c.length = 3.99 ;
        c.type = "SUV" ;
        c.name = "Kia Sonet " ;
        c.torque = 178 ;
        c.seat = 5 ;
        c.print();
//        change(c) ;
//        System.out.print(c.seat);
    }
//    public static void change(Car c){
//        c.seat = 4 ;
//    }
}
