package AbstractMethod_exemplo;


public class FabricaModerna implements FabricaAbstrata {


    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }


    public Mesa createMesa() {
        return new MesaModerna();
    }
}