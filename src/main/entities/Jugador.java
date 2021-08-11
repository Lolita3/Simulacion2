package main.entities;

import java.io.Serializable;


public class Jugador implements Serializable {
    private static final long serialVersionUID = 239329L;

    private String nombre;
    private Integer edad;
    private Integer estatura;
    private Integer Peso;
    private String Nacionalidad;
    private String Club;
    private String camiseta;
    private String fechaNacimiento;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public Integer getEdad() {return edad;
   }

   public void setEdad(Integer edad) {
       this.edad = edad;
   }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

 public Integer getPeso() {
       return Peso;
    }

    public void setPeso(Integer peso) {
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
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Jugador(){

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

