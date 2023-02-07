package pulley.main;
import pulley.main.DummyGuyMass;
import pulley.main.RollBlock;

/*
класс моделирующий полиспаст систему
аргументы: вес, множество блок-ролликов(кратность)
*/
public class PulleySystem {
    private double eValue;
    private double mechanicalAdvantage;
    private double velocityRatio;
    DummyGuyMass weight_object;
    RollBlock[] multiplicity;

    PulleySystem(DummyGuyMass obj, RollBlock[] rolls){
        this.weight_object = obj;
        this.multiplicity = rolls;
        this.eValue = obj.weight;
    }

    private int m_multiplicity(){
        int rolls = this.multiplicity.length;
        this.eValue = (int) (2*rolls);
        System.out.println("E_value: "+ this.eValue);

        return  (int) this.eValue;
    }

    public double newForce(){
        int mult = this.m_multiplicity();
        double newForce = this.weight_object.weight/mult;
        return newForce;
    }


}
