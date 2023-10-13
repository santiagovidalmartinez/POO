package gestion;
import java.util.ArrayList;
import java.util.List;
public class main {

    public static void main(String[] args) {
   List<Vehiculo> vehiculos = new ArrayList<>();
   
   vehiculos.add(new automovil("Toyota","Camry ", 2019,"juan",4));
   vehiculos.add(new automovil("honda","civic ", 2020,"maria",4));
   vehiculos.add(new motocicleta("suzuki","r15 ", 2022,"pedro",200));
   vehiculos.add(new motocicleta("kawasaki","ninja ", 2021,"ana",400));
   vehiculos.add(new automovil("ford","camry ", 2019,"carlos",4));
   vehiculos.add(new motocicleta("yamaha","camry ", 2019,"laura",500));
   vehiculos.add(new motocicleta("eco","luxe ", 2013,"miguel",100));
   vehiculos.add(new automovil("renould","logan ", 2019,"luis",4));
   vehiculos.add(new automovil("toyota","txl ", 2019,"elena ",2));
   vehiculos.add(new motocicleta("suzuki","rx ", 2019,"diego",115));
   
   
   for(int i = 0 ; i < vehiculos.size(); i++){
       for ( int j = i + 1 ; j < vehiculos.size(); j++){
           if (vehiculos.get(i).getPropietario().equals(vehiculos.get(j).getPropietario()))
               System.out.println("propietario duplicado : "+vehiculos.get(i).getPropietario());
       }
   }
     
   for( Vehiculo vehiculo : vehiculos  ){
       vehiculo.mostrarInformacion();
       System.out.println("--------------------------------------------------------");
   }
   
        System.out.println("vehiculos automovil:");
        for(Vehiculo vehiculo : vehiculos){
            if ( vehiculo instanceof automovil){
                vehiculo.mostrarInformacion();
                System.out.println("-----------------------------------------------");
            }
        }
   
     System.out.println("vehiculos motocicleta:");
        for(Vehiculo vehiculo : vehiculos){
            if ( vehiculo instanceof motocicleta){
                vehiculo.mostrarInformacion();
                System.out.println("-----------------------------------------------");
            }
        }
        // Modificar el nombre del propietario de un vehículo en específico
        String placaModificar = "Toyota Camry 2019";
        String nuevoPropietario = "Roberto";
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof automovil && vehiculo.getMarca().equals("Toyota")
                    && vehiculo.getModelo().equals("Camry") && vehiculo.getAño() == 2019) {
                vehiculo.setPropietario(nuevoPropietario);
                break;
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
   
   
   
    
    

    

