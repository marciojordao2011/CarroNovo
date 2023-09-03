package interativo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroEsportivoTest {

    @Test
    public void testCarroAntigo() {
        
        CarroEsportivo carroAntigo = new CarroEsportivo("MarcaAntiga", "ModeloAntigo", 1985);

        
        assertTrue(carroAntigo.ehCarroAntigo());
    }

    @Test
    public void testCarroModerno() {
        
        CarroEsportivo carroModerno = new CarroEsportivo("MarcaModerna", "ModeloModerno", 1990);

        
        assertFalse(carroModerno.ehCarroAntigo());
    }
}





