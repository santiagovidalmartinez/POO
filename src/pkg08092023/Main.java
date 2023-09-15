package pkg08092023;

import exercise.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persona[] objPersona = new Persona[2];
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        objPersona[0] = new Persona("santiago ", "1235645667", "cali");
        objPersona[1] = new Persona("camila", "6752543265", "bogota");

        for (int i = 0; i < objPersona.length; i++) {
            System.out.println("==========Datos de persona " + (i + 1) + "==========");
            System.out.println("Nombre: " + objPersona[i].getName() + "\n"
                    + "Documento: " + objPersona[i].getDocument() + "\n"
                    + "Ciudad: " + objPersona[i].getCountry());
        }

        //ciclo para leer datos por pantalla
        System.out.println(".....................................................");
        System.out.println(".....................................................");
        for (int i = 0; i < objPersona.length; i++) {
            System.out.println("==========Ingrese los datos de la persona " + (i + 1) + "==========");
            System.out.println("Ingrese el nombre de la persona");
            objPersona[i].setName(scan1.nextLine());
            System.out.println("Ingrese el documento de la persona");
            objPersona[i].setDocument(scan2.nextLine());
            System.out.println("Ingrese el nombre de su ciudad de nacimiento");
            objPersona[i].setCountry(scan1.nextLine());
        }

        System.out.println(".....................................................");
        System.out.println(".....................................................");
        for (int i = 0; i < objPersona.length; i++) {
            System.out.println("==========Datos de persona " + (i + 1) + "==========");
            System.out.println("Nombre: " + objPersona[i].getName() + "\n"
                    + "Documento: " + objPersona[i].getDocument() + "\n"
                    + "Ciudad: " + objPersona[i].getCountry());
        }
    }

}
/*
        System.out.println("======datos de la persona=======");
        System.out.println("Nombre: " + objPersona.getName());
        System.out.println("Documento: " + objPersona.getDocument());
        System.out.println("Ciudad: " + objPersona.getCountry());

        System.out.println("================================");
        System.out.println("Ingrese el nombre de la persona");
        String nameObj = scan.nextLine();
        //objPersona.setName(scan.nextLine);------funciona pero no se si es adecuado
        System.out.println("Ingrese el documento de la persona");
        String documentObj = scan.nextLine();
        System.out.println("Ingrese la ciudad de la persona");
        String countryObj = scan.nextLine();

        objPersona.setName(nameObj);
        objPersona.setDocument(documentObj);
        objPersona.setCountry(countryObj);

        //puede hacerse una funcion +imprimirDatosPersona();
        System.out.println("======nuevos datos de la persona=======");
        System.out.println("Nombre: " + objPersona.getName());
        System.out.println("Documento: " + objPersona.getDocument());
        System.out.println("Ciudad: " + objPersona.getCountry());
        //Alt+shift+f -> Organizar Codigo
 */
