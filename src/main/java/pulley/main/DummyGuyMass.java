package pulley.main;

public class DummyGuyMass {
    double weight;

    DummyGuyMass(double value){
        this.weight = value;
        String valueinfo = String.format("class was inited .Weight is %s", this.weight);
        System.out.printf(valueinfo);
    }

    public static void main(String[] args){
        System.out.println("there is main method-0");
    }
}
