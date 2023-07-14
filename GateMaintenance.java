public interface GateMaintenance {


    public  void create(BoardingGate g);
    public void update(String tr, int bg, String av);
    public void deleteAll ();
    public void deleteBy(String nt, int ng);
    public void read();



}
