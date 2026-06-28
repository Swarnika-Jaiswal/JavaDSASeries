public class Bi_Car extends Bh_Vehicle {

    public int noOfDoors;
    public String transmissionType;

    Bi_Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType ) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine();
    }

    public void startAC()
    {
        System.out.println("AC started of " + name );
    }


    }



