package animal;

public class Fish extends Animal {
    public Boolean saltwater_;

    public Fish(Boolean saltwater) {
        saltwater_ = saltwater;
    }

    public String accept(Visitor v) {
        return v.visitFish(this);
    }
}
