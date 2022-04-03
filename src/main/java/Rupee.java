import java.util.Objects;

public class Rupee {
    private final int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){

        if( obj == null || (obj.getClass() != this.getClass())){
            return false;
        }

        Rupee rupee = (Rupee) obj;
        return this.value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

/* getClass returns true if the object is actual instance of a class.
   instanceof operator returns true if object is belongs to a class or a subclass.

   here we are doing downCasting for accessing the child class fields.
   == operator checks the memory location.

   equals override method - common to all objects. It is inbuilt polymorphism.
   garbage collector uses the equals' method a lot - Collectively it saves a lot of time

   hash value is same for two objects means it doesn't mean the objects are equal.
   Because overlapping is possible in hash - Hash collision
   Hash value is not equal means, then we can say objects are not equal */