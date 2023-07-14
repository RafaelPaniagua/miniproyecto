import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables para avion
        String tp ;
        int  nr ;
        int  cp ;
        String al ;
        String st ;
        ///////////////
        //Variables para Puerta
        String tr;
        int ng ;
        String av;
        /////////////////////////////////////////////////

        PlainOperations po = new PlainOperations();
        GateOperations go = new GateOperations();

        boolean activo = true;


        Scanner lector = new Scanner(System.in);
        do {

            System.out.println("--------------------------------------------------------------");
            System.out.println("MANTENIMIENTO DE AVIONES");

            System.out.println("Que operación desea realizar:");
            System.out.println("1- Agregar avión");
            System.out.println("2- Modificar avión");
            System.out.println("3- Eliminar avión");
            System.out.println("4- Listar Aviones");

            System.out.println("---------------------------------------------------------------");
            System.out.println("MANTENIMIENTO DE PUERTAS DE EMBARQUE");

            System.out.println("5- Agregar puerta");
            System.out.println("6- Modificar puerta");
            System.out.println("7- Eliminar puerta");
            System.out.println("8- Listar puerta");
            System.out.println("---------------------------------------------------------------");
            System.out.println("9- Salir");
            System.out.println("---------------------------------------------------------------");

            int opcion = lector.nextInt();

            if (opcion == 1) {
                System.out.println("Agregando Avión");

                System.out.println("Escriba el tipo de aeronave: ");
                 tp = lector.next();
                System.out.println("Escriba el número de registro: ");
                nr = lector.nextInt();
                lector.nextLine();
                System.out.println("Escriba la capacidad:");
                cp = lector.nextInt();
                lector.nextLine();
                System.out.println("Escriba el nombre de la aerolinea: ");
                al = lector.nextLine();
                System.out.println("Escriba el estatus: ");
                st = lector.nextLine();

                Plane p = new  Plane(tp,nr,cp,al,st);
                po.create(p);

            } else if (opcion == 2) {

                System.out.println("Modificando Avion");

                System.out.println("Escriba el numero de registro del avion que desea modificar: ");
                nr = lector.nextInt();
                lector.nextLine();


                System.out.println("Escriba el tipo de aeronave: ");
                tp = lector.next();

                lector.nextLine();
                System.out.println("Escriba la capacidad:");
                cp = lector.nextInt();
                lector.nextLine();
                System.out.println("Escriba el nombre de la aerolinea: ");
                al = lector.nextLine();
                System.out.println("Escriba el estatus: ");
                st = lector.nextLine();


                Plane p = new  Plane(tp,nr,cp,al,st);

                po.update(nr,p);

            } else if (opcion == 3) {

                System.out.println("Escriba el  Número de Regisro del avión");
                nr = lector.nextInt();
                po.deleteBy(nr);


            } else if (opcion == 4) {
                System.out.println("La lista de aviones es: ");
                po.read();
                System.out.println("-----------------------------------------------------");

            } else if (opcion == 5) {

                System.out.println("Agregando Puerta");

                System.out.println("Escriba la Terminal a la que pertenece la puerta: ");
                tr = lector.next();
                System.out.println("Escriba el número de la puerta: ");
                ng = lector.nextInt();
                lector.nextLine();

                BoardingGate g = new BoardingGate(tr,ng);
                go.create(g);




            } else if (opcion == 6) {


                System.out.println("Modificando Puerta de embarque");

                System.out.println("Escriba el numero de la terminal: ");
                tr = lector.next();
                System.out.println("Escriba el numero de puerta a modificar : ");
                ng = lector.nextInt();

                lector.nextLine();
                System.out.println("Puerta está disponible:");
                av = lector.nextLine();


            //    Plane p = new  Plane(tp,nr,cp,al,st);
                go.update(tr,ng,av);


            }else if (opcion == 7) {

                System.out.println("Borrando puerta de embarque");

                System.out.println("Escriba el  Número de la terminal:");
                tr = lector.next();
                System.out.println("Escriba el número de la puerta: ");
                ng = lector.nextInt();
              //  lector.nextLine();


            go.deleteBy(tr,ng);



            }else if (opcion == 8) {

                System.out.println("La lista de puertas es: ");
                go.read();
                System.out.println("-----------------------------------------------------");

            } else if (opcion == 9) {
                activo = false;

                System.out.println("Ha salido del programa");
            }  else {
                System.out.println("Esta opción no es válida");
            };

        }
        while (activo);
    }
}