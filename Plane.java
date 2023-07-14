public class Plane extends Aircraft {

    String airline;
   // String typeTransport;
    String status;

    public Plane() {
    }

    public Plane(String type, int numRecord, int capacity, String airline, String status) {
        super(type, numRecord, capacity);
        this.airline = airline;

        this.status = status;
    }


    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
