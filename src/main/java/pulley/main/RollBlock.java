package pulley.main;

public class RollBlock {
    double mass;
    int id;
    private double coef;

    RollBlock(int id){
        this.id = id;
        this.coef = 0.5;
    }

    public void main(String[] args){

    }

    public double new_force(){
        double result = this.mass * this.coef;
        return result;
    }
}
