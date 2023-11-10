package Gestion;
import java.util.ArrayList;
import java.util.List;
public class main {

    public static void main(String[] args) {
   List<vehiculo> vehiculos = new ArrayList<>();
   
        // Llena el arreglo con al menos 10 datos diferentes (Automóviles y Motocicletas)
        vehiculos.add(new Automovil("Toyota", "Camry", 2019, "Juan", 4));
        vehiculos.add(new Automovil("Honda", "Civic", 2020, "Maria", 4));
        vehiculos.add(new Motocicleta("Harley-Davidson", "Sportster", 2018, "Pedro", 883.0));
        vehiculos.add(new Motocicleta("Kawasaki", "Ninja", 2021, "Ana", 600.0));
        vehiculos.add(new Automovil("Ford", "Focus", 2017, "Carlos", 4));
        vehiculos.add(new Motocicleta("Yamaha", "YZF-R6", 2019, "Laura", 600.0));
        vehiculos.add(new Motocicleta("Suzuki", "GSX-R750", 2020, "Miguel", 750.0));
        vehiculos.add(new Automovil("Chevrolet", "Cruze", 2016, "Luis", 4));
        vehiculos.add(new Automovil("Volkswagen", "Jetta", 2018, "Elena", 4));
        vehiculos.add(new Motocicleta("Honda", "CBR500R", 2017, "Diego", 500.0))
   
    // No se debe permitir duplicidad de propietarios
   for(int i = 0 ; i < vehiculos.size(); i++){
       for ( int j = i + 1 ; j < vehiculos.size(); j++){
           if (vehiculos.get(i).getPropietario().equals(vehiculos.get(j).getPropietario()))
               System.out.println("propietario duplicado : "+vehiculos.get(i).getPropietario());
       }
   }
      // Itera sobre el arreglo y muestra la información de cada vehículo
   for( vehiculo vehiculo : vehiculos  ){
       vehiculo.mostrarInformacion();
       System.out.println("--------------------------------------------------------");
   }
   // Obtener todos los Vehículos Automóvil
        System.out.println("vehiculos automovil:");
        for(vehiculo vehiculo : vehiculos){
            if ( vehiculo instanceof automovil){
                vehiculo.mostrarInformacion();
                System.out.println("-----------------------------------------------");
            }
        }
    // Obtener todos los Vehículos Motocicleta
     System.out.println("vehiculos motocicleta:");
        for(vehiculo vehiculo : vehiculos){
            if ( vehiculo instanceof motocicleta){
                vehiculo.mostrarInformacion();
                System.out.println("-----------------------------------------------");
            }
        }
   
    // Modificar el nombre del propietario de un vehículo en específico
   String placamodificar = "toyota camry 2019";
   String nuevopropietario  = "roberto";
   
   for (vehiculo vehiculo : vehiculos ){
       if(vehiculo instanceof automovil && vehiculo.getMarca().equals("toyota")
           && vehiculo.getModelo().equals("camry")&& vehiculo.getAño()==2019){
           vehiculo.setPropietario(nuevopropietario);
       }    
  }  
  // Obtener todos los Vehículos para verificar que se modificó
        System.out.println("Vehículos después de la modificación:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println("-------------------------");
        }

  // Obtener un vehículo específico identificado por placa
        String placaBuscada = "Suzuki GSX-R750 2020";
        for (Vehiculo vehiculo : vehiculos) {
            String placa = vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.getAño();
            if (placa.equals(placaBuscada)) {
                System.out.println("Vehículo encontrado:");
                vehiculo.mostrarInformacion();
                break;
            }
        }
        
    }
    
}
