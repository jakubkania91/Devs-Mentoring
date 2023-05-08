package myTrials.MyTrialsall.Circle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        int radius = 5;
        System.out.println("Kolo ma promien o wymiarach " + radius);
        System.out.println("Pole kola wynosi:  " + circle.getArea());
        System.out.println("Obwod kola wynosi: " + circle.getCircumference());

        radius = 8;
        circle.setRadius(radius);
        System.out.println("\nPromien teraz wynosi: " + radius);
        System.out.println("Pole kola teraz wynosi: " + circle.getArea());
        System.out.println("Obwod kola teraz wynosi: " + circle.getCircumference());

    }
}
