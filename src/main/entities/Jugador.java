package main.entities;

import java.io.Serializable;
import java.time.LocalDate;


public class Jugador implements Serializable {
    private static final long serialVersionUID = 239329L;

    private String nombre;
    private String edad;
    private String estatura;
    private String Peso;
    private String Nacionalidad;
    private String Club;
    private String camiseta;
    private LocalDate fechaNacimiento;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public String getEdad() {return edad;
   }

   public void setEdad(String edad) {
       this.edad = edad;
   }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

 public String getPeso() {
       return Peso;
    }

    public void setPeso(String peso) {
       Peso = peso;
   }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Jugador(String cristiano, int i, String estatura, String peso, String portugal, String realMadrid, String camiseta, LocalDate parse) {}

    public Jugador(String nombre, String edad, String estatura, String Peso, String Nacionalidad, String Club, String Camiseta, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.Peso = Peso;
        this.Nacionalidad = Nacionalidad;
        this.Club = Club;
        this.camiseta = camiseta;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", estatura='" + estatura + '\'' +
                ", Peso='" + Peso + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Club='" + Club + '\'' +
                ", camiseta='" + camiseta + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }


}

