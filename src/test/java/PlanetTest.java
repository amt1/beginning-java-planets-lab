import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet planet;

    @Before
    public void before(){
        this.planet = new Planet("Mars", 908973);
    }

    @Test
    public void hasName() {
        //arrange
        //act
        //assert  expected, actual
        assertEquals("Mars", planet.getName());
        // cursor inside, alt + enter for list to import
    }

    @Test
    public void hasSize() {
        assertEquals(908973, planet.getSize());
    }

    @Test
    public void canExplode() {
        assertEquals("Boom! Mars has exploded.", planet.explode("Mars"));
    }
}
