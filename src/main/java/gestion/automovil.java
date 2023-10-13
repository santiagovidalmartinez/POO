
package gestion;

public class automovil extends Vehiculo {
    int numeroDePuertas;

    public automovil(String marca, String modelo, int año, String propietario, int numeroDePuertas) {
        super(marca, modelo, año, propietario);
        this.numeroDePuertas = numeroDePuertas;
    }

    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("numero de puertas :"+numeroDePuertas);
        int Añosencirculacion = 2023 - año ;
        System.out.println("años de ciculacion : "+Añosencirculacion);
        
        
        
        
        
           
       
       
   
   
     
  }      
        
        
        
        
    }
