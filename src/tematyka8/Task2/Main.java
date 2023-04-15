package tematyka8.Task2;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(10);

        double areaSquare = square.calculateArea();
        System.out.println("Pole powierzchni kwadratu o boku 10: " + areaSquare);

        Shape shape = new Shape();
        double areaShape = shape.calculateArea();
        System.out.println(areaShape);

    }
}
