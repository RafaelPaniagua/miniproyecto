import java.util.ArrayList;
import java.util.Iterator;

public class GateOperations implements  GateMaintenance {


    ArrayList<BoardingGate> arrayBoardingGate = new ArrayList<BoardingGate>();


    @Override
    public void create(BoardingGate g) {

        arrayBoardingGate.add(g);

        System.out.println("El registro fue agregado con exito");



    }

    @Override
    public void update(String tr, int ng, String av) {

        Iterator<BoardingGate> it = arrayBoardingGate.iterator();

        while (it.hasNext()) {
            BoardingGate g = it.next();



            if (g.getTerminal().equals(tr) && g.getNumGate() == ng) {

              //  p.setType(newp.getType());
                if(av == "Si" || av =="SI" || av == "S" ){

                    g.setAvailable(true);
                } else if (av == "No" || av == "NO" || av == "n") {
                    g.setAvailable(false);

                }else{
                    g.setAvailable(false);
                }

            }
        }
        System.out.println("El registro fue modificado con exito");




    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteBy(String nt, int ng) {

        Iterator<BoardingGate> it = arrayBoardingGate.iterator();

        while (it.hasNext()) {

            BoardingGate bg = it.next();

            if ((bg.getTerminal().equals(nt) && (bg.getNumGate() == ng)) ){
                it.remove();

            }
        }
        System.out.println("El registro fue borrado con exito");

    }

    @Override
    public void read() {

        String  string = "";

        for(int i = 0; i< arrayBoardingGate.size(); i++) {
            string += "Puerta "+  (i +1 ) + "-------------------------------------\n";
            string += "Terminal: " + arrayBoardingGate.get(i).getTerminal()+ "\n";
            string += "Número: " + arrayBoardingGate.get(i).getNumGate() + "\n";
            string += "Disponible: " + arrayBoardingGate.get(i).getAvailable() +"\n";

        }
        System.out.println(string);

    }
}
