abstract class Room{
    protected int numBeds;
    protected int sqFeet;
    protected double pricePerNight;

    public Room(int numBeds, int sqFeet, double pricePerNight){
        this.numBeds = numBeds;
        this.sqFeet = sqFeet;
        this.pricePerNight = pricePerNight;
    }

    public void display(){
        System.out.println("No. of beds : " + numBeds);
        System.out.println("Sq. feet : " + sqFeet);
        System.out.println("Price per Night : " + pricePerNight);
    }
}
class SingleRoom extends Room{
    public SingleRoom(){
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room{
    public DoubleRoom(){
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room{
    public SuiteRoom(){
        super(3, 750, 5000.0);
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("Hotel Room");
        Room room = new SingleRoom();
        System.out.println("\nSingle Room");
        room.display();
        Room room1 = new DoubleRoom();
        System.out.println("\nDouble Room");
        room1.display();
        Room room2 = new SuiteRoom();
        System.out.println("\nSuite Room:");
        room2.display();
    }
}
