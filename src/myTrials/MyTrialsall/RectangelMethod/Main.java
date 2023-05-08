package myTrials.MyTrialsall.RectangelMethod;

public class Main {
    public static void main(String[] args) {

        Rectangel rectangel = new Rectangel(7,10);
        System.out.println("Pole prostokata to: " + rectangel.getArea());
        System.out.println("Obwod prostokata to: " + rectangel.getPerimeter());

        rectangel.setWidth(9);
        rectangel.setHeight(10);

        System.out.println("\nPole prostokata teraz to: " + rectangel.getArea());
        System.out.println("Obwod prostokata to: " + rectangel.getPerimeter());
    }
}
