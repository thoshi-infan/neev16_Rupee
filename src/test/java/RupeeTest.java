import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RupeeTest {

    @Test
    public void shouldReturnFalseWhenRupeeIsNotSame(){

        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(tenRupee, anotherTenRupee);
    }

    @Test
    public void shouldReturnTrueWhenRupeeValueIsEqual(){

        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        boolean check = tenRupee.equals(anotherTenRupee);

        assertTrue(check);
    }

}
