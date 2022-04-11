package animal;

public abstract class Animal {

    // Do this as String without generics first.
    interface Visitor<T> {
        T visitCow(Cow c);
        T visitSnake(Snake s);
        T visitFish(Fish f);
    }

     public abstract <T> T accept(Visitor<T> v);
}
