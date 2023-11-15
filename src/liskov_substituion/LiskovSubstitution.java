package liskov_substituion;

public class LiskovSubstitution {
    // USE CASE
    // vi har en parent klass, Bird. Vi kan ha många child klasser såsom sparv, struts, örn, falk m.m.
    // men är det rätt att ha sparv och struts som extendar Bird?

    public static void main(String[] args) {
        // kan inte flyga
        Ostrich ostrich = new Ostrich();
        ostrich.greet();
       // ostrich.fly();

        // kan flyga
        Sparrow sparrow = new Sparrow();
       // sparrow.greet();
        sparrow.fly();
    }
}

class Bird {
    public void greet() {
        System.out.println("greeting...");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Sparrow extends FlyingBird {}

class Ostrich extends Bird {}