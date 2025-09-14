
package FactoryMethod_exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SorveteMorangoTest {

    @Test
    void devePrepararMorango() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Morango");
        assertEquals("Sorvete de Morango preparado", sorvete.preparar());
    }

    @Test
    void deveCancelarMorango() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Morango");
        assertEquals("Sorvete de Morango cancelado", sorvete.cancelar());
    }

}
