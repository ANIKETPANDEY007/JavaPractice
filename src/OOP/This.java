package OOP;

public class This {
    public static class Car {
        int price; // 0
        String name; // null


        Car(String name ,int price) {
                this.price = price ;
                this.name = name ;
        }
        void print(){
            System.out.println(price+" "+name);
        }

    }
        public static void main(String[] args) {
            Car c1 = new Car("Kia Sonet", 4000000);
            c1.print();
            Car c2 = new Car( "Audi", 20000000);
            c2.print();
        }

}
