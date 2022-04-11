package animal;

public class Cow extends Animal {
    public String name_;

    public Cow(String name) {
        name_ = name;
    }

    public String accept(Visitor v) {
        return v.visitCow(this);
    }
}

