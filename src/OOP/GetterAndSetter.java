package OOP;

public class GetterAndSetter {
    public static class Student{ // whole process will ke known as encapculation only if everything will be private.
        String name ;
        private int rno  = 10 ;
        double cgpa ;
        void print(){ //getter
            System.out.println(name+" "+rno+" "+cgpa);
        }
        int getRno(){ //getter
            return rno ;
        }
        void setRno(int x){ //setter
            rno = x ;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.cgpa = 8.9 ;
        s1.name = "Aniket" ;
        s1.print();
        s1.setRno(45);
        System.out.println(s1.getRno());
    }
}
