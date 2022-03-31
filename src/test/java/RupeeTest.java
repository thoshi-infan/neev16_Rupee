import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {

    @Test
    public void shouldReturnFalseWhenRupeeIsNotSame(){

        Rupee TenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(TenRupee, anotherTenRupee);
    }


}
