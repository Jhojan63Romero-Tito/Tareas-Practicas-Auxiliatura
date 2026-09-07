package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICA_GENERAL;
// Sea la clase auto
//                  -----------------------------
//                             Auto
//                  -----------------------------
//                   - marca : String
//                   - modelo : String 
//                   - año : int 
//                   - kilometraje : int
//                  ------------------------------
//                  ------------------------------
// a) Agrega un metodo para mostrar el kilometraje en kilometros y metros
// b) Agrega un metodpo para cambiar el color del auto 
// c) Crea dos autos, cambiales el color y muestra su kilometraje en kilometros y metros 
class Auto{
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    private String color;
    public Auto(String marca, String modelo, int año, int kilometraje, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.color = color;
    }
    public void mostrarKilometraje(){
        int kilometros = kilometraje / 1000;
        int metros = kilometraje % 1000;
        System.out.println("Color: " + color);
        System.out.println("Kilometros: " + kilometros + " km");
        System.out.println("Metros: " + metros + " m");
    }
    public void CambiarColor(String nuevoColor){
        this.color = nuevoColor;
    }
    
}

public class AutoPOO {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2006, 125750, "Rojo");
        Auto auto2 = new Auto("Nissan", "Sentra", 2015, 84325, "Verde");
        System.out.println(" -- Auto 1 --");
        auto1.mostrarKilometraje();
        System.out.println(" -- Auto 2 --");
        auto2.mostrarKilometraje();
        auto1.CambiarColor("Plomo");
        auto2.CambiarColor("Lila");
    }
}
