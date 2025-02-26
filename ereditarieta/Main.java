package ereditarieta;
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println("Rettangolo: Area = " + rettangolo.area() + " | Perimetro = " + rettangolo.perimetro());
        
        Quadrato quadrato = new Quadrato(4);
        System.out.println("Quadrato: Area = " + quadrato.area() + " | Perimetro = " + quadrato.perimetro());
    }
}
