import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leercsv {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\lolit\\Downloads\\Universidad\\IIQ-2021\\SistemasOperativos\\Simulacion2\\players_15.csv");
    }

}

