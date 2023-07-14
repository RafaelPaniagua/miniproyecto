public class BoardingGate {

    String terminal;
    int numGate;
    boolean available;
    String strAvailable ;

    public BoardingGate() {
    }

    public BoardingGate(String terminal, int numGate) {
        this.terminal = terminal;
        this.numGate = numGate;
        this.available= true;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getNumGate() {
        return numGate;
    }

    public void setNumGate(int numGate) {
        this.numGate = numGate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAvailable() {
        if (available) {

            strAvailable = "Si";

        } else  {
            strAvailable = "No";
        }
        return strAvailable;
    }


}
