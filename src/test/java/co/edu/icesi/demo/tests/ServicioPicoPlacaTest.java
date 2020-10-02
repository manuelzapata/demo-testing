package co.edu.icesi.demo.tests;

import co.edu.icesi.demo.Ciudad;
import co.edu.icesi.demo.Dia;
import co.edu.icesi.demo.ServicioPicoPlaca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicioPicoPlacaTest {

    @Test
    public void testTienePicoPlaca(){

        ServicioPicoPlaca servicio = new ServicioPicoPlaca();

        boolean resultado = servicio.tienePicoPlaca(Ciudad.CALI, Dia.LUNES, "ABC123");

        Assertions.assertTrue(resultado);
    }

    @Test
    public void testPlacaInvalida() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ServicioPicoPlaca servicio = new ServicioPicoPlaca();
            servicio.tienePicoPlaca(Ciudad.CALI, Dia.LUNES, "KMFKDMFKMFK");
        });

    }

}
