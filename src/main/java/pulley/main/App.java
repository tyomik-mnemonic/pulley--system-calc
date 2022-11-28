package pulley.main;
import pulley.main.DummyGuyMass;
import pulley.main.RollBlock;
public class App {
    public static void main(String args[]){
        DummyGuyMass weight = new DummyGuyMass(100.0);
        RollBlock first = new RollBlock(weight, 1);
        System.out.println(first.new_force());
    }
}
