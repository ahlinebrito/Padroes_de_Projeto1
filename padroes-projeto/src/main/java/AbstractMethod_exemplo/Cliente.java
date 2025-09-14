package AbstractMethod_exemplo;


public class Cliente {

    private Cadeira cadeira;
    private Mesa mesa;

    public Cliente (FabricaAbstrata fabrica) {
        this.cadeira = fabrica.createCadeira();
        this.mesa = fabrica.createMesa();
    }

    public String venderCadeira() {
        return this.cadeira.vender();
    }

    public String venderMesa() {
        return this.mesa.vender();
    }
}