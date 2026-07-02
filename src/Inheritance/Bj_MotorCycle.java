package Inheritance;

public class Bj_MotorCycle extends Bh_Vehicle {

    public String handelBarStyle;

    public String suspensionType;

    Bj_MotorCycle(String name, String model, int noOfTyres, String handelBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handelBarStyle = handelBarStyle;
        this.suspensionType = suspensionType;

    }

    public void wheelie(){
        System.out.println("Motorcyle is doing wheeliee"+ name);

    }
}
