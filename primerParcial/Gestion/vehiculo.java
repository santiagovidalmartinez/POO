
package Gestion;

public class vehiculo {
    String marca;
    String modelo;
    int año;
    String propietario;

    public vehiculo(String marca, String modelo, int año, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarInformacion(){
        System.out.println("marca : "+marca);
        System.out.println(" modelo : "+modelo);
        System.out.println("año : "+ año);
        System.out.println("propietario : "+propietario);
    }
     public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
