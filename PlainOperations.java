import java.util.ArrayList;
import java.util.Iterator;

public class PlainOperations implements PlainMaintenance {

ArrayList<Plane> arrayPlane = new ArrayList<Plane>();
Plane pl = new Plane();


    @Override
    public void create(Plane p) {


        arrayPlane.add(p);

        System.out.println("El registro fue agregado con exito");



        }

    @Override
    public void update(int num, Plane newp) {

        Iterator<Plane> it = arrayPlane.iterator();

        while (it.hasNext()) {
            Plane p = it.next();
            if (p.getNumRecord() == num) {

                p.setType(newp.getType());
                p.setCapacity(newp.getCapacity());
                p.setAirline(newp.getAirline());
                p.setStatus(newp.getStatus());

            }
        }
        System.out.println("El registro fue modificado con exito");

    }

    @Override
    public void delete() {

         }

    @Override
    public void deleteBy(int num) {


        Iterator<Plane> it = arrayPlane.iterator();

        while (it.hasNext()) {
            Plane p = it.next();
            if (p.getNumRecord() == num) {
                it.remove();


            }
        }
        System.out.println("El registro fue eliminado con exito");
    }


    @Override
    public void read() {

        String  string = "";
        for( int i = 0 ; i<arrayPlane.size(); i++) {
            string += "Avion "+  (i +1 ) + "------------------------------------\n";
            string += "Numero de Registro: " + arrayPlane.get(i).getNumRecord() + "\n";
            string += "Aerolinea: " + arrayPlane.get(i).getAirline() + "\n";
            string += "Capacidad: " + arrayPlane.get(i).getCapacity() + "\n";
            string += "Estado: " + arrayPlane.get(i).getStatus() + "\n";


        }
        System.out.println(string);
    }
    @Override
    public Plane findBy(int num) {



        Iterator<Plane> it = arrayPlane.iterator();
        boolean encontrado =false;
        while (it.hasNext() && !encontrado ) {

            Plane p = it.next();
           if (p.getNumRecord() == num) {
                // it.remove();
               encontrado = true;
               pl = p;
           }
        }
            return pl;
    }
}
