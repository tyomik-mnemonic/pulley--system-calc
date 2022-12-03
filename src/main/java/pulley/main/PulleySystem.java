package pulley.main;
import pulley.main.DummyGuyMass;
import pulley.main.RollBlock;

public class PulleySystem {
    DummyGuyMass weight_object;
    RollBlock[] multiplicity;

    PulleySystem(DummyGuyMass obj, RollBlock[] rolls){
        this.weight_object = obj;
        this.multiplicity = rolls;
    }


}
