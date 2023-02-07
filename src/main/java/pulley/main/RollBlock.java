package pulley.main;

/*
класс моделирующий блок-роллик
*/
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
    /*TODO: когда перепишу на новый метод рассчёта - убрать
     */
    public double new_force(){
        double result = this.mass * this.coef;
        return result;
    }

    private double newForce(){
        double result = 0.0;
        return  result;
    }
}
