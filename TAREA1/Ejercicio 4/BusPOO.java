package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICA_GENERAL;

import java.util.Scanner;

// Realiza la abstraccion de un Bus
// a) Al bus desean subir X cantidad de pasajeros, actualiza los datos del bus
// b) Crea un metodo para cobrar pasaje a los pasajeros. (Costo del pasaje: bs 1.50)
// c) Muestra cuantos asientos quedan disponibles
// d) Crea una instancia del bus y utiliza los metodos de los incisos anteriores
class Bus{
    private int CantidadPasajeros;
    private double pasaje;
    private int asientos;
    
    public Bus(int CantidadPasajeros, double pasaje, int asientos){
        this.CantidadPasajeros = CantidadPasajeros;
        this.pasaje = pasaje;
        this.asientos = asientos;
    }
    public void DatosBus(int X){
        this.CantidadPasajeros = X;
        System.out.println("Cantidad de pasajeros: " + this.CantidadPasajeros + "pasajeros");
        System.out.println("Pasaje a cobrar: " + this.pasaje + " Bs");
        System.out.println("Asientos: " + this.asientos );
    } 
    public void CobrarPasaje(){
        double total = this.CantidadPasajeros * this.pasaje;
        System.out.println("Pasaje Cobrado: " + total + " Bs");
    }
    public void AsientosDisponibles(){
        this.asientos = this.asientos - this.CantidadPasajeros;
        System.out.println("Asientos Disponibles: " + this.asientos);
    }
}

public class BusPOO {
    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        ps.useLocale(java.util.Locale.US);
        System.out.println("Ingrese la cantidad de pasajeros que desean subir: ");
        int X = ps.nextInt();
        double pasaje = 1.50;
        System.out.println("Ingrese la vcantidad de asientos: ");
        int asientos = ps.nextInt();
        Bus bs = new Bus(0, pasaje, asientos);
        bs.DatosBus(X);
        bs.CobrarPasaje();
        bs.AsientosDisponibles();
    }
    
}
