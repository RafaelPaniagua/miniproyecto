public class Aircraft {

    private String type;
    private int numRecord;
    private String model;
   private int capacity;
    private int length;
    private String owner;
    private String typeMotor;
    private int fligthTime;


    public Aircraft() {
    }

    public Aircraft(String type, int numRecord, String model, int capacity, int length, String owner, String typeMotor, int fligthTime) {
        this.type = type;
        this.numRecord = numRecord;
        this.model = model;
        this.capacity = capacity;
        this.length = length;
        this.owner = owner;
        this.typeMotor = typeMotor;
        this.fligthTime = fligthTime;
    }

    public Aircraft(String type, int numRecord, int capacity) {
        this.type = type;
        this.numRecord = numRecord;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumRecord() {
        return numRecord;
    }

    public void setNumRecord(int numRecord) {
        this.numRecord = numRecord;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(String typeMotor) {
        this.typeMotor = typeMotor;
    }

    public int getFligthTime() {
        return fligthTime;
    }

    public void setFligthTime(int fligthTime) {
        this.fligthTime = fligthTime;
    }
}
