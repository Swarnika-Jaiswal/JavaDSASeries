public class Bh_Car extends Bi_Vehicle{

    public int noOfDoors;
    public String transmissionType;

    Bh_Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType ) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine();
    }

    public void started()
    {
        System.out.println("AC started of " + name );
    }


    }



