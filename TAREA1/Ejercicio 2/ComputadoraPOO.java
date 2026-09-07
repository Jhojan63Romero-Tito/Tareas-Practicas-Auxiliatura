package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICA_GENERAL;
// Sea la clase Computadora, se pide realizar:
//              ----------------------
//                   Computadora
//              ----------------------
//              - marca : String
//              - procesador : String 
//              - ram : int
//              - almacenamiento : int
//              -----------------------
//              ----------------------
// a) Instanciar 2 objetos de diferente mejor 
// b) Determinar si la cantidad de memoria RAM es igual a X
// c) De 2 computadoras, mostrar los datos de la que tiene mayor capacidad de almacenamiento
class Computadora {
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;
    public Computadora(String marca, String procesador, int ram, int almacenamiento){
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    public void MemoriaX(int X){
        if (this.ram == X) {
            System.out.println("La memoria RAM es igual: " + X + " GB");
        } else {
            System.out.println("La memoria RAM no es igual: " + X + " GB");
        }
    }
    public void MayorCapacidad(Computadora comp){
        if (this.almacenamiento > comp.almacenamiento) {
            System.out.println("Marca: " + this.marca);
            System.out.println("Pocesador: " + this.procesador);
            System.out.println("La RAM: " + this.ram + " GB");
            System.out.println("Almacenamiento: " + this.almacenamiento);
        } else {
            System.out.println("Marca: " + comp.marca);
            System.out.println("Pocesador: " + comp.procesador);
            System.out.println("La RAM: " + comp.ram + " GB");
            System.out.println("Almacenamiento: " + comp.almacenamiento);
        }
    }
}
public class ComputadoraPOO {
    public static void main(String[] args) {
        Computadora comp1 = new Computadora("HP", "Intel Core i5", 8, 512);
        Computadora comp2 = new Computadora("Lenovo", "AMD Ryzen 5", 16, 1000);
        System.out.println("La computadora 1");
        comp1.MemoriaX(8);
        System.out.println("La computadora 2 ");
        comp2.MemoriaX(8);
        System.out.println();
        System.out.println("Computadora con mayor almacenamiento");
        comp1.MayorCapacidad(comp2);
    }
}
