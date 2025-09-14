package FactoryMethod_exemplo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteChocolateTest {

    @Test
    void devePrepararChocolate() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Chocolate");
        assertEquals("Sorvete de Chocolate preparado", sorvete.preparar());
    }

    @Test
    void deveCancelarChocolate() {
        ISorvete sorvete = SorveteFactory.obterSorvete("Chocolate");
        assertEquals("Sorvete de Chocolate cancelado", sorvete.cancelar());
    }

}