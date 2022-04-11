import animal.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Cow("Bessie"), new Snake("Python", 0.5), new Fish(true) };

        RideVisitor rv = new RideVisitor();
        for (Animal a : animals) {
            System.out.println(a.accept(rv));
        }
    }
}
