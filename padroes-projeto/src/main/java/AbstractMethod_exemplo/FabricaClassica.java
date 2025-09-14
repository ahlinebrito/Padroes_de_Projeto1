package AbstractMethod_exemplo;



public class FabricaClassica implements FabricaAbstrata {


    public Cadeira createCadeira() {
        return new CadeiraClassica();
    }


    public Mesa createMesa() {
        return new MesaClassica();
    }
}