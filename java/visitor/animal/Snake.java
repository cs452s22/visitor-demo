package animal;

public class Snake extends Animal {
    public String species_;
    public Double slitheriness_;

    public Snake(String species, Double slitheriness) {
        species_ = species;
        slitheriness_ = slitheriness;
    }

    public String accept(Visitor v) {
        return v.visitSnake(this);
    }
}
