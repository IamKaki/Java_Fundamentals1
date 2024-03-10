public class creatingObjects{
    public void fullThrotle(){
        System.out.println("The vehicle is moving at full throttle.");
    }
    public void speed(){
        System.out.println("The speed as of now is 180Km/h.");
    }

    public static void main(String[] args) {
        creatingObjects myCar = new creatingObjects();
        myCar.fullThrotle();
        myCar.speed();
    }
}