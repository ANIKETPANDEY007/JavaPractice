package OOP;
class Pokemon{
    private int power ;
    String type ;
    Pokemon(String type , int power){
        this.power = power ;
        this.type = type ;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class StrongPokemon extends Pokemon{ // child class
    int speed ;
}
class LegendryPokemon extends Pokemon{ // child class
    String ability ;
}
class GodPokemon extends LegendryPokemon{ // child class
    char tag ;
}
public class Inheritence {
    public static void main(String[] args) {
        LegendryPokemon mewtwo = new LegendryPokemon() ;
        mewtwo.ability = "Pressure" ;
        GodPokemon dialga = new GodPokemon() ;

    }
}
