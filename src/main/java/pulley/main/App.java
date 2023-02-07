package pulley.main;
import pulley.main.DummyGuyMass;
import pulley.main.RollBlock;
import pulley.main.PulleySystem;
public class App {
    public static void main(String args[]){
        DummyGuyMass weight = new DummyGuyMass(100.0);
        RollBlock first = new RollBlock( 1);
        RollBlock[] rolls = new RollBlock[] {first};

        PulleySystem pullespast = new PulleySystem(weight,rolls);
        System.out.println("new force is: " + pullespast.newForce());
        //System.out.println(pullespast.weight_object.weight);
    }
}
