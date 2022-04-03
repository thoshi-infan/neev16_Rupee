import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {

    @Test
    public void shouldReturnFalseWhenRupeeIsNotSame(){

        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(tenRupee, anotherTenRupee);

        //assertSame - check if the object references pointing to the same object.
        //assertEquals - check if the objects are equal.
    }

    @Test
    public void shouldReturnTrueWhenRupeeValueIsEqual(){

        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        boolean check = tenRupee.equals(anotherTenRupee);

        assertTrue(check);
    }

    @Test
    public void shouldReturnTrueWhenRupeeIsNotNull(){

        Rupee tenRupee = new Rupee(10);

        assertNotNull(tenRupee);

        //Object is null or not.
    }

    @Test
    public void shouldReturnFalseWhenRupeeIsNotSameType(){

        Rupee tenRupee = new Rupee(10);
        Object obj = new Object();

        boolean check = tenRupee.equals(obj);

        assertFalse(check);
    }

}
