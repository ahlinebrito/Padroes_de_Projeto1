package FactoryMethod_exemplo;

public class SorveteChocolate implements ISorvete {

    public String preparar() {
        return "Sorvete de Chocolate preparado";
    }

    public String cancelar() {
        return "Sorvete de Chocolate cancelado";
    }
}
