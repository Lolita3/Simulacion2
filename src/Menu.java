//? William Aguilar ayudo con el entregable
    import main.entities.Jugador;

    import java.io.File;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Menu {
        public  static   ArrayList<Jugador> leerDatosDat() throws IOException, ClassNotFoundException {
            FileInputStream fi = new FileInputStream(new File("C:\\Users\\lolit\\Simulacion2\\finalOutput.dat"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList<Jugador> jugador = new ArrayList<Jugador>();
            try {
                Jugador obj = null;
                while ((obj = (Jugador) oi.readObject()) != null) {
                    jugador.add(obj);
                }
            }catch (Exception e){
                oi.close();
                fi.close();
            }
            oi.close();
            fi.close();
            return jugador;
        }


        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {
                System.out.println("LEAD UNIVERSITY");
                System.out.println("Alumna: Lolita Maldonado");
                System.out.println("Simulacion #2");
                System.out.println("Elija una opcion de busqueda");
                System.out.println("1.Nombre ");
                System.out.println("2.Edad");
                System.out.println("3. Estatura");
                System.out.println("4. Peso");
                System.out.println("5. Nacionalidad");
                System.out.println("6. Club");
                System.out.println("7. Camiseta");

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                ArrayList<Jugador> datos= leerDatosDat() ;


                switch (opcion) {
                    case 1:
                        long start = System.currentTimeMillis();

                        System.out.println("Nombres de los jugadores");
                        String lectura = sn.next();
                        for (Jugador jugador : datos) {
                            if (jugador.getNombre().contains(lectura)) {
                                System.out.println(jugador);
                            }
                        }
                        long finish = System.currentTimeMillis();
                        long timeElapsed = finish - start;
                        System.out.println("Ejecucion del programa: " + timeElapsed + " mili segundos");

                        break;
                    case 2:

                        System.out.println("Edades de los jugadores");
                        Integer leerdatos= sn.nextInt();
                        for (Jugador jugador : datos) {
                            if (jugador.getEdad()==(leerdatos)) {
                                System.out.println(jugador);

                            }
                        }

                        break;
                    case  3:
                        System.out.println("Estatura de los jugadores");
                        Integer lec = sn.nextInt();
                        for (Jugador jugador : datos) {
                            if (jugador.getEstatura() == (lec)) {
                                System.out.println(jugador);
                            }
                        }

                        break;
                    case  4:
                        System.out.println("Peso de los jugadores");
                        Integer lectu = sn.nextInt();
                        for (Jugador jugador : datos) {
                            if (jugador.getPeso() == (lectu)) {
                                System.out.println(jugador);
                            }
                        }
                        break;
                    case  5:


                        System.out.println("Nacionalidad de los jugadores");
                        String lecturer = sn.next();
                        for (Jugador jugador : datos) {
                            if (jugador.getNacionalidad().contains(lecturer)){
                                System.out.println(jugador);
                            }
                        }

                        break;

                    case  6:
                        System.out.println("Club de los jugadores");
                        String lecturr = sn.next();
                        for (Jugador jugador : datos) {
                            if (jugador.getClub().contains(lecturr)){
                                System.out.println(jugador);
                            }
                        }
                        break;
                    case  7:
                        System.out.println("Camiseta de los jugadores");
                        String lecturre = sn.next();
                        for (Jugador jugador : datos) {
                            if (jugador.getCamiseta().contains(lecturre)){
                                System.out.println(jugador);
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Fecha de Nacimiento de los jugadores");
                        String lect = sn.next();
                        for (Jugador jugador : datos) {
                            if (jugador.getFechaNacimiento().contains(lect)){
                                System.out.println(jugador);
                            }
                        }
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Gracias por usar el buscador");
                }
            }


        }
    }
