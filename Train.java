public class Train {
    private String name;
    private int cost;
    private int speed;
    public static int length;
    static {
        System.out.println("static block in train");
    }
    {
        System.out.println(" non-static block in train");
        name = "ONDEBHARATH";
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setCost(int TrainCost) {
        cost = TrainCost;
    }

    public int getCost() {
        return cost;
    }

    public void setSpeed(int speedOfTrain) {
        speed = speedOfTrain;
    }

    public int getSpeed() {
        return speed;
    }
}
