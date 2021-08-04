
    import java.util.Scanner;

    public class Menu {

        public static void main(String[] args) {
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

                switch (opcion) {
                    case 1:
                        System.out.println("Nombres de los jugadores");
                        break;
                    case 2:
                        System.out.println("Edades de los jugadores");
                        break;
                    case  3:
                        System.out.println("Estatura de los jugadores");
                        break;
                    case  4:
                        System.out.println("Peso de los jugadores");
                        break;
                    case  5:
                        System.out.println("Nacionalidad de los jugadores");
                        break;
                    case  6:
                        System.out.println("Club de los jugadores");
                        break;
                    case  7:
                        System.out.println("Camiseta de los jugadores");
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("");
                }
            }


        }
    }
