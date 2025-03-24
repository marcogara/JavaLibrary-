import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberFactoryTest {

    @Test
    void twoplustwoisfour () {
        assertEquals(4, NumberFactory.add(2, 2));
    }

}