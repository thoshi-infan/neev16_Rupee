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
        return this.value == ((Rupee) obj).value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
