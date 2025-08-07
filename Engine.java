public class Engine {
    private int engineCC;
    private String engineType;
    private String name;

    public Engine(int engineCC, String engineType, String name) {
        this.engineCC = engineCC;
        this.engineType = engineType;
        this.name = name;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getName() {
        return name;
    }
}
