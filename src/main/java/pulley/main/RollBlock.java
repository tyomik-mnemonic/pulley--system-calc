package pulley.main;
import pulley.main.DummyGuyMass;

public class RollBlock {
    DummyGuyMass mass;
    int id;
    double coef;

    RollBlock(DummyGuyMass mass, int id){
        this.mass = mass;
        this.id = id;
        this.coef = 0.5;
    }

    public void main(String[] args){

    }

    public double new_force(){
        double result = this.mass.weight * this.coef;
        return result;
    }
}
