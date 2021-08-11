package main;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;



public class Main2 {


    public static void main(String[] args) {

        HashMap data = new HashMap();
        ArrayList<String> jugador = new ArrayList<>();
        jugador.add("Pais");
        jugador.add("Estatura");
        jugador.add("Peso");
        jugador.add("Edad");
        data.put(1, jugador);

        try {
            FileOutputStream f = new FileOutputStream(new File("C:\\Users\\lolit\\Simulacion2\\misObjetos.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(data);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("C:\\Users\\lolit\\Simulacion2\\misObjetos.dat"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            HashMap pr1 = (HashMap) oi.readObject();

            System.out.println(((ArrayList)pr1.get(1)).size());
            System.out.println(((ArrayList)pr1.get(1)).get(2));


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
