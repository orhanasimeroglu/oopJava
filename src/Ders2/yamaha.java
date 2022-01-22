package Ders2;


    public class yamaha extends MountainBike{
        public yamaha(int startHeight, int startCadence, int startSpeed, int startGear, int max_speed) {
            super(startHeight, startCadence, startSpeed, startGear);

            this.max_speed=max_speed;
        }

        int max_speed;
        public void setSpeed(int newValue) {

            max_speed = newValue;
        }

        public static void main(String[] args) {

            yamaha Bike ;
            yamaha Bike1 = new yamaha(11,1,21,15,50);

        }

    }


