package FactoryMethod_exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteFactoryTest {

    @Test
    void deveRetornarExcecaoParaSaborInexistente() {
        try {
            ISorvete sorvete = SorveteFactory.obterSorvete("Feijão");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sabor inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSorveteInvalido() {
        try {
            ISorvete sorvete = SorveteFactory.obterSorvete("Abacaxi");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sorvete inválido", e.getMessage());
        }
    }
}