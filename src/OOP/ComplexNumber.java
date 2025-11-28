package OOP;
class ComplexNo{
    double x ;
    double y ;
    ComplexNo(double x, double y){ // constructor create kiye
        this.x = x ;
        this.y = y ;
    }
    ComplexNo(){

    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(ComplexNo z){
        x += z.x ;
        y += z.y ;
    }

    void multiply(ComplexNo z) {
        x = x*z.x-y*z.y ;
        y = x*z.y + z.x*y ;

    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNo z1 = new ComplexNo(2,-5) ;
        ComplexNo z2 = new ComplexNo(4,8) ;
        z1.print();z2.print();
//        z1.add(z2);
//        z1.print();
        z2.multiply(z1);
        z2.print();
    }
}
