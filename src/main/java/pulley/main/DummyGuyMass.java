package pulley.main;

public class DummyGuyMass {
    double weight;
    /*
    Объект моделиррующий вес поднимаемый
    в полиспасс системе
    */
    DummyGuyMass(double value){
        this.weight = value;
        String valueInfo = String.format("class was inited .Weight is %s", this.weight);
        System.out.printf(valueInfo);
    }

    public static void main(String[] args){
        System.out.println("there is main method-0");
    }
}
