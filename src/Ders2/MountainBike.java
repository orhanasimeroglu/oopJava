package Ders2;

public class MountainBike extends BicycleNew {
    // the MountainBike subclass has
// one field
    public int seatHeight;
    // the MountainBike subclass has
// one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // the MountainBike subclass has
// one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
/*    public static void main(String[] args){




    }*/
}

