public interface PlainMaintenance {


    public  void create(Plane p);
    public void update(int num, Plane p);
    public void delete ();
    public void deleteBy(int num);
    public void read();
    public Plane findBy( int num );

}
