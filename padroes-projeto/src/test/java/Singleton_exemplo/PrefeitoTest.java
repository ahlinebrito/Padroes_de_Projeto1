package Singleton_exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefeitoTest {

    @Test
    public void deveRetornarNome() {
        Prefeito.getInstance().setNome("Prefeito Fulano");
        assertEquals("Prefeito Fulano", Prefeito.getInstance().getNome());
    }

    @Test
    public void deveRetornarPartido() {
        Prefeito.getInstance().setPartido("Partido Tal");
        assertEquals("Partido Tal", Prefeito.getInstance().getPartido());
    }

}