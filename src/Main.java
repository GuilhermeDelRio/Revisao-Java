import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um raio: ");
        double raio = input.nextDouble();

        System.out.println("Informe outro raio: ");
        double raio2 = input.nextDouble();

        c1.setRadius(raio);
        System.out.println("Raio do primeiro objeto: " + c1.getRadius());
        System.out.println("Area do segundo objeto: " + c2.getArea(raio2));
    }
}