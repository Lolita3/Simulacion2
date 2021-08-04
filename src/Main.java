import main.entities.Jugador;

import java.io.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Jugador unJugador = new Jugador("Cristiano","29","185","80","Portugal","Real Madrid","7",
                LocalDate.parse("1985-02-05"));
        Jugador otroJugador = new Jugador("Arjen","30","180","80","Netherlands",
                "FCBayernManchen","10",LocalDate.parse("1984-01-23"));

        try {
            FileOutputStream f = new FileOutputStream(new File("C:\\Users\\lolit\\Simulacion2\\misObjetos.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(unJugador);
            o.writeObject(otroJugador);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("C:\\Users\\lolit\\Simulacion2\\misObjetos.dat"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Jugador j1 = (Jugador) oi.readObject();
            Jugador j2 = (Jugador) oi.readObject();

            System.out.println(j1.toString());
            System.out.println(j2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
