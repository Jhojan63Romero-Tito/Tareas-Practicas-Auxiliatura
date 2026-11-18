package SEGUNDO_SEMESTRE.PROGRAMACION_2.SEGUNDO_PARCIAL;
class Anuncio{
    private int numero;
    private double precio;
    public Anuncio(int numero, double precio){
        this.numero = numero;
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
class Obra{
    private String titulo;
    private String material;
    private Artista a1, a2; // Composicion creo es
    private Anuncio b; // Agregacion creo es aqui 
    public Obra(String titulo, String material, String nombre1, int ci1, int añosExperiencia1, String nombre2, int ci2, int añosExperiencia2, Anuncio b){ // -> en Anuncio b : es Agregacion
        this.titulo = titulo;
        this.material = material;
        this.a1 = new Artista(nombre1, ci1, añosExperiencia1); // Composicion
        this.a2 = new Artista(nombre2, ci2, añosExperiencia2); // Composicion
        this.b = b; // Agregacion
    }
    public Artista getA1(){
        return a1;
    }
    public Artista getA2(){
        return a2;
    }
    public Anuncio getB(){
        return b;
    }
    public void setB(Anuncio b){
        this.b = b;
    }
}
class Pintura extends Obra{
    private String genero;
    public Pintura(String titulo, String material, String nombre1, int ci1, int añosExperiencia1, String nombre2, int ci2, int añosExperiencia2, Anuncio b, String genero){
        super(titulo, material, nombre1, ci1, añosExperiencia1, nombre2, ci2, añosExperiencia2, b); // Aqui hace efecto la composicion
        this.genero = genero;
    }
}
class Artista{
    private String nombre;
    private int ci;
    private int añosExperiencia;
    public Artista(String nombre, int ci, int añosExperiencia){
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }
    public String getNombre(){
        return nombre;
    }
    public int getAñosExperiencia(){
        return añosExperiencia;
    }
}
public class RepasoSegundoParcial {
    public static void main(String[] args) {
        Anuncio anuncio1 = new Anuncio(1, 300);
        // a) Crear un objeto pintura que tenga un anuncio y oto objeto pintura sinn anuncio
        Pintura p1 = new Pintura("Paisaje", "Oleo", "Hernan", 1234567, 10, "Carlos", 3456784, 2, anuncio1, "Oculto");
        Pintura p2 = new Pintura("La Noche", "Acuarela", "Juan", 4567895, 5, "Angel", 1546347, 3, null, "Realismo");
        // b) Mostrar el nombre del artista con mas años de Experiencia de amabas pinturas
        Artista mayor = p1.getA1();
        if (p1.getA2().getAñosExperiencia() > mayor.getAñosExperiencia()) {
            mayor = p1.getA2();
        }
        if ((p2.getA1()).getAñosExperiencia() > mayor.getAñosExperiencia()) {
            mayor = p2.getA1();
        }
        if (p2.getA2().getAñosExperiencia() > mayor.getAñosExperiencia()) {
            mayor = p2.getA2();
        }
        System.out.println("Artistas con mayor experiencia: " + mayor.getNombre());
        // c) Se ha decidido vender la pintura sin anuncio, se pide agregar un anuncio
        //    de venta y determine el monto total de venta de ambas pinturas
        Anuncio anuncio2 = new Anuncio(2, 700);
        p2.setB(anuncio2);
        double total = p1.getB().getPrecio() + p2.getB().getPrecio();
        System.out.println("Monto total de Ventas: " + total);
    }
}
