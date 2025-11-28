package OOP;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bark ");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow ");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Roar ");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }

    public static void main(String[] args) {
        Lion l = new Lion() ;
        Dog d = new Dog() ;
        Cat c = new Cat() ;
        Pikachu p = new Pikachu() ;
        d.speak();
        l.speak();
        c.speak();
        p.speak();
    }
}
