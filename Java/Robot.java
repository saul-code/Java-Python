import java.util.Scanner;
public class Robot {

    //Atributos
    String numeroSerie;
    String nombre;
    int nivelBateria;
    boolean encendido;

    //Creacion del objeto (constructor)
    public Robot(String ns, String n, int nb, boolean e){
        numeroSerie = ns;
        nombre = n;
        nivelBateria = nb;
        encendido = e;
    }

    //Metodos
    public void saluda(){
        if(this.getEstatus()==true){
            System.out.println("Hola soy: "+this.numeroSerie+" y me llamo "+ this.nombre)
            int bateriaActual = this.getNivelBateria();
            int bateriaRestante  = bateriaActual -10;
            this.setNivelBateria(bateriaRestante);
        }
    }

    //setter
    public void setNumeroSerie(String ns){
        numeroSerie = ns;
    }

    public void setNombre(String n){
        nombre = n;
    }

    public void setNivelBateria(int nb){
        nivelBateria = nb;
    }

    public void setEstatus(boolean e){
        encendido = e ;
    }

    //getter
    public String getNumeroSerie(){
        return numeroSerie;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNivelBateria(){
        return nivelBateria;
    }

    public boolean getEstatus(){
        return encendido;
    }
}