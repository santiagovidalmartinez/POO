package gestion;

public class motocicleta extends Vehiculo {
    double cilindrada;

    public motocicleta(String marca, String modelo, int año, String propietario,double cilindrada) {
        super(marca, modelo, año, propietario);
        this.cilindrada = cilindrada;
    }

    @Override
 public void mostrarInformacion(){
     super.mostrarInformacion();
        System.out.println("cilindrada :"+cilindrada);
        int Añosencirculacion = 2023 - año ;
        System.out.println("años de ciculacion : "+Añosencirculacion);
     
 }
    
}
