package AbstractMethod_exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveVenderCadeiraClassica() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cadeira Classica", cliente.venderCadeira());
    }

    @Test
    void deveVenderCadeiraModerna() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cadeira Moderna", cliente.venderCadeira());
    }

    @Test
    void deveVenderMesaClassica() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Mesa Classica", cliente.venderMesa());
    }

    @Test
    void deveVenderMesaModerna() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Mesa Moderna", cliente.venderMesa());
    }

}