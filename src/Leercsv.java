import main.entities.Jugador;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Leercsv {

    public  static void guardarDatos(ArrayList<Jugador> Jugadores) throws IOException {
        FileOutputStream f = new FileOutputStream(new File("C:\\Users\\lolit\\Simulacion2\\finalOutput.dat"));
        ObjectOutputStream o = new ObjectOutputStream(f);

        Jugadores.forEach(x -> {
            try {
                o.writeObject(x);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        o.close();
        f.close();
    }

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        ArrayList<Jugador> jugadorArrayList = new ArrayList<Jugador>();
        while((cadena = b.readLine())!=null) {
            Jugador jugador=new Jugador();
            System.out.println(cadena);
            String [] data =cadena.split(",");
            jugador.setNombre(data[0]);
            jugador.setEdad(Integer.parseInt(data[1]));
            DateTimeFormatter df = DateTimeFormatter.ofPattern("M/d/yyyy");
            jugador.setFechaNacimiento(data[2]);

          jugador.setEstatura(Integer.parseInt(data[3]));
            jugador.setPeso(Integer.parseInt(data[4]));
            jugador.setNacionalidad(data[5]);
            jugador.setClub(data[6]);



            if (data.length > 7){
                jugador.setCamiseta((data[7]));
            }else{
                jugador.setCamiseta("00");
            }


            jugadorArrayList.add(jugador);
        }
        guardarDatos(jugadorArrayList);
        b.close();
        f.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\lolit\\Simulacion2\\players_15.csv");
    }

}

