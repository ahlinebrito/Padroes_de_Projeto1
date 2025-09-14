
package FactoryMethod_exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SorveteBaunilhaTest {

    @Test
    void devePrepararBaunilha() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Baunilha");
        assertEquals("Sorvete de Baunilha preparado", sorvete.preparar());
    }

    @Test
    void deveCancelarBaunilha() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Baunilha");
        assertEquals("Sorvete de Baunilha cancelado", sorvete.cancelar());
    }

}