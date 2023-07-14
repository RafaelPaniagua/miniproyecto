public class Departures {
    String time;
    String destination;

    int numberPlane;
    int numberTerminal;
    int numberGate;
    String remarks;

    public Departures() {
    }

    public Departures(String time, String destination, int numberPlane, int numberTerminal, int numberGate) {
        this.time = time;
        this.destination = destination;
        this.numberPlane = numberPlane;
        this.numberTerminal = numberTerminal;
        this.numberGate = numberGate;
    }

    public Departures(String time, String destination, int numberPlane, int numberTerminal, int numberGate, String remarks) {
        this.time = time;
        this.destination = destination;
        this.numberPlane = numberPlane;
        this.numberTerminal = numberTerminal;
        this.numberGate = numberGate;
        this.remarks = remarks;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberPlane() {
        return numberPlane;
    }

    public void setNumberPlane(int numberPlane) {
        this.numberPlane = numberPlane;
    }

    public int getNumberTerminal() {
        return numberTerminal;
    }

    public void setNumberTerminal(int numberTerminal) {
        this.numberTerminal = numberTerminal;
    }

    public int getNumberGate() {
        return numberGate;
    }

    public void setNumberGate(int numberGate) {
        this.numberGate = numberGate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
