package pulley.main;
import pulley.main.DummyGuyMass;
import pulley.main.RollBlock;
import pulley.main.PulleySystem;
public class App {
    public static void main(String args[]){
        DummyGuyMass weight = new DummyGuyMass(100.0);
        RollBlock first = new RollBlock( 1);
        RollBlock[] rolls = new RollBlock[] {first};

        PulleySystem pullespas = new PulleySystem(weight,rolls);
        System.out.println(first.new_force());
        System.out.println(pullespas.weight_object.weight);
    }
}
