package animal;

public abstract class Animal {
    interface Visitor {
        String visitCow(Cow c);
        String visitSnake(Snake s);
        String visitFish(Fish f);
    }

     abstract public String accept(Visitor v);
}
