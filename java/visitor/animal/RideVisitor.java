package animal;

public class RideVisitor implements Animal.Visitor {
    public String visitSnake(Snake s) {
        return "Slithering";
    }

    public String visitCow(Cow c) {
        return "Walking";
    }

    public String visitFish(Fish f) {
        return "Swimming";
    }
}
