package FactoryMethod_exemplo;

public class SorveteMorango implements ISorvete{

    public String preparar() {
        return "Sorvete de Morango preparado";
    }

    public String cancelar() {
        return "Sorvete de Morango cancelado";
    }
}

