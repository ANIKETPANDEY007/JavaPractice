package OOP;
class Fraction{
    int num ;
    int den ;
    Fraction(int num,int den){
        this.num = num ;
        this.den = den ;
        simplify() ;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        this.num = num*f.den + den*f.num ;
        this.den = den*f.den ;
        simplify();
    }
    void simplify(){
        int gcd = hcf(num,den) ;
        num = num/gcd ;
        den = den/gcd ;
    }
    int hcf(int a, int b){
        if(a==0) return b ;
        return hcf(b%a,a) ;
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7) ;
        Fraction f2 = new Fraction(5,10) ;
//        f1.add(f2) ;
        f2.print() ;
    }
}


