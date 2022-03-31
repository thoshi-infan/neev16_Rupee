public class Rupee {
    private final int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){

        return this.value == ((Rupee) obj).value;
    }
}
